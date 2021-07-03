package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		//创建客户端的套接字！  //IP 和端口号！
		Socket socket = null;
		BufferedReader br = null;
		try {//套接字請求。 包含ip地址和port號！
			socket = new Socket("127.0.0.1",30001);
			//得到输入
			br =new BufferedReader(
				new InputStreamReader( socket.getInputStream()));
			//读取数据！
			String line =br.readLine();
			//将读取的数据写到控制台！
			System.out.println("from server："+line);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//关闭资源！
			try {
				br.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}
