package net.chat;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//两个类。分别是两个线程。一个接受服务器信息并打印到控制台
//另一个接受键盘输入，发送给服务器！主线程还要负责与服务器进行连接！同时启动另一个线程
public class MyClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1 创立连接
		Socket s = new Socket("127.0.0.1",30001);
		//2 启动一个线程工作！此线程接收服务器内容，并打印倒控制台！
		new Thread(new ClientThread(s)).start();
		//主线程接受键盘输入，发送给服务器！
		//3 得到输出流。
		PrintStream ps = new PrintStream(
				s.getOutputStream());
		//4 取得键盘内容
		Scanner scanner = new Scanner(System.in);
		String line;
		//只要有键盘内容，就循环获得。
		while(scanner.hasNext()){
			line =scanner.next();
			if(line.equals("exit")){
				break;//如果是exit字符串，则退出程序 ，否则发送给服务器！
			}else{//5 发送数据line给服务器！
				ps.println(line);
			}
		}
		//关闭资源 关闭顺序倒序！
		ps.close();
		s.close();
	}
}
