package net1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建套接字！指定IP Port 与ip和端口的服务端进行连接！
		Socket socket = null;
		BufferedReader br = null;
		try {//老师服务器ip 192.168.202.229
			 socket = new Socket("127.0.0.1",30000);
			//如果成功创建连接! 则socket返回
			//得到输入流！并且包装成BufferedReader类对象
			 br= new	BufferedReader(
					new InputStreamReader( socket.getInputStream()));
			String line = br.readLine();
			System.out.println("来自服务器的消息："+line);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
				try {
					br.close();
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}			
		}
	}

}
