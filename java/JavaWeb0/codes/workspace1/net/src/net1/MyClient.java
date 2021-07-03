package net1;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClient {
	//任务有两个 1 接收服务器消息。 2 发送消息给服务器！
	public static void main(String[] args) throws UnknownHostException, IOException{
		Socket s  = new Socket("192.168.202.229",30000);
		//将此客户端的套接字作为此客户端的接收线程运行起来！
		//任务1 能够接收来自服务器的消息！
		new Thread(new ClientThread(s)).start();
		//任务2 发送消息给服务器
		//得到输出流，输出给服务器！
		PrintStream ps = new PrintStream(s.getOutputStream());
		//得到键盘流
		Scanner scanner = new Scanner(System.in);
		//循环如果有键盘消息，则发送给服务器！
		while(scanner.hasNext()){
			String str=scanner.next();
			if(str.endsWith("exit")){
				break;
			}else{
				ps.println(str);
			}
		}
		scanner.close();
		ps.close();
		s.close();
	}

}
