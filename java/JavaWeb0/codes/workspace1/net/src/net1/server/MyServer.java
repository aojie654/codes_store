package net1.server;
import java.net.*;
import java.io.*;
import java.util.*;

//服务器思路 1 有个list保存所有客户端的socket
//有个线程一直准备响应客户端建立连接！socket
public class MyServer
{
	//定义保存所有Socket的ArrayList
	public static ArrayList<Socket> socketList
		= new ArrayList<>();
	public static void main(String[] args) 
		throws IOException
	{
		ServerSocket ss = new ServerSocket(30001);
		while(true)
		{
			// 此行代码会阻塞，将一直等待别人的连接
			Socket s = ss.accept();
			socketList.add(s);
			// 每当客户端连接后启动一条ServerThread线程为该客户端服务
			new Thread(new ServerThread(s)).start();
			//为每个客户产生一个线程进行读数据并广播！
		}
	}
}
