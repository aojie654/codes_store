package net.chat;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.net.*;
//需要两个server类。一个list保存客户端socket 并启动线程运行！
//另一个server线程负责接收客户端内容，并广播给所有人！
public class MyServer {
	//list保存所有客户端线程
	public static List<Socket> list = new ArrayList<Socket>();
	
	public static void main(String[] args) throws IOException{
		//定义serversocket
		ServerSocket ss = new ServerSocket(30001);
		while(true){//等待客户请求。并产生连接好的套接字
			Socket s = ss.accept();
			list.add(s);//保管产生的套接字s到list中！
			//将负责接收此客户的线程启动。主要负责此客户消息的接收和广播给所有人！
			new Thread(new ServerThread(s)).start();
		}
	}
}
