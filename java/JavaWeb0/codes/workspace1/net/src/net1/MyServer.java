package net1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MyServer {
	public static List<Socket> list= new ArrayList<Socket>();
	//服务器思路 1 有个list保存所有客户端的socket
	//有个线程一直准备响应客户端建立连接！socket
	public static void main(String[] args) throws IOException {
		ServerSocket ss =new ServerSocket(30001) ;
		while(true){
			Socket s = ss.accept();//1 接收客户端连接请求
			list.add(s);//2 放套接字到list中！
			new Thread(new ServerThread(s)).start();//启动客户端套接字线程
		}
	}

}
