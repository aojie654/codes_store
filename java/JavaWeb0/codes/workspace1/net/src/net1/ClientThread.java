package net1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

//初始化与服务器的Socket 同时 接收服务器内容，并打印控制台！
public class ClientThread implements Runnable{

	private Socket s;
	private BufferedReader br=null;
	//初始化此类！保存套接字和输入流
	public ClientThread(Socket s) throws IOException{
		this.s = s;
		br = new BufferedReader(
			new InputStreamReader(	s.getInputStream()));
	}
	//持续接收服务器数据，并打印！
	public void run(){
		String content;
		try {
			while((content=br.readLine())!=null){
				System.out.println("来自服务器:"+content);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
