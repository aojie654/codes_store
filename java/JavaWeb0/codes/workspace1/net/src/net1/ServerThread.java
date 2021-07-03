package net1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
//广播中加上发消息的ip地址！
//初始化与服务器的Socket 同时 接收服务器内容，并打印控制台！
public class ServerThread implements Runnable{

	private Socket s;
	private BufferedReader br=null;
	//初始化此类！保存套接字和输入流
	public ServerThread(Socket s) throws IOException{
		this.s = s;
		br = new BufferedReader(
			new InputStreamReader(	s.getInputStream()));
	}
	//持续接收服务器数据，并打印！
	public void run(){
		String content;
		try {//当readFromClient为null说明客户退出了
			while((content=readFromClient())!=null){
				//for循环每个客户端的套接字！
				for(Socket s:MyServer.list){
					PrintStream ps =new PrintStream(s.getOutputStream());
					ps.print(content);//广播给每个客户端！
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String readFromClient(){
		try {
			return br.readLine();
		} catch (IOException e) {
			//如果出现异常，说明客户端退了。所以要从list中移除本s
			MyServer.list.remove(s);
		}
		return null;//如果出现问题则return null
	}
}
