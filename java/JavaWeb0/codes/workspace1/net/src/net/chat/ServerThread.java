package net.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerThread implements Runnable{
	private String ip;//得到客户的ip地址
	private Socket s;//服务器端与当前客户建立的套接字！
	private BufferedReader br;//得到客户端输入流
	public ServerThread(Socket s) throws IOException{
		this.s =s;//初始化s
		ip=s.getInetAddress().toString();//初始化ip地址
		//客户端得到输入流。也就是得到服务器发送过来的数据！
		br = new BufferedReader(
				new InputStreamReader(
						s.getInputStream()));
	}
	@Override
	public void run() {
		String content ;
		//广播给每个套接字消息！
		while((content =readFromClient())!=null){
			content +=ip;//输出内容加上客户的ip
			for(Socket s:MyServer.list){//遍历所有的套接字。
				//向每个套接字发送消息
				PrintStream ps;
				try {
					ps = new PrintStream(s.getOutputStream());
					ps.println(content);	
				} catch (IOException e) {
				}
			}
		}
	}
	private String readFromClient(){
		try {
			return br.readLine();
		} catch (IOException e) {
			//客户端下线了。list中移除下线的套接字s
			MyServer.list.remove(s);
		}
		return null;
	}
}
