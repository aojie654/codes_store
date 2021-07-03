package Lessons.Week6.L611_Net.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket socket = new Socket("127.0.0.1",30000);

		BufferedReader br =new BufferedReader(
				new InputStreamReader( socket.getInputStream()));

		String line =br.readLine();
		System.out.println("from server:"+line);

		br.close();
		socket.close();
	}

}
