package net.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
//接收服务器端消息，并打印到控制台！
public class ClientThread implements Runnable{
	private Socket s;//套接字
	private BufferedReader br;//客户端输入流就是服务器发送的消息！
	public ClientThread(Socket s) throws IOException{
		this.s =s;
		//客户端得到输入流。也就是得到服务器发送过来的数据！
		br = new BufferedReader(
				new InputStreamReader(
						s.getInputStream()));
	}
	//接收服务器端发送的内容，并打印到控制台
	@Override
	public void run() {
		String line;
		try {//循环从服务器端读取数据！如果不为null则打印控制台！
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
