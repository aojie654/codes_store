package net1;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	public static void main(String[] args) throws IOException{
		//服务器socket 不指定ip，本机。port要指定
		ServerSocket ss = new ServerSocket(30001);
		//持续对请求进行响应 ！127.0.0.1
		while(true){//Socket s = new Socket("192.168.202.229",30000);
			Socket s = ss.accept();//ss套接字等待客户端发出请求！
			// s就是建立好的服务器端的套接字！
			PrintStream ps =new PrintStream(s.getOutputStream());
			ps.println("hello，谢谢你的访问！"+s.getInetAddress());
			
			//关闭资源
			ps.close();
			s.close();
		}
		
		
	}
}
