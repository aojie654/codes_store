package Lessons.Week6.L611_Net.net;

import java.io.IOException;
import java.net.InetAddress;

public class InetAddressTest {

	public static void main(String[] args) throws IOException {
		//InetAddress 没构造函数！
		InetAddress ipnet=InetAddress.getByName("www.163.com");
		boolean bool=ipnet.isReachable(2000);
		System.out.println("网易 是否可达:"+bool);
		System.out.println(ipnet.getHostName());
		System.out.println(ipnet.getHostAddress());
		
		InetAddress local =InetAddress.getLocalHost();
		System.out.println("local 是否可达："+local.isReachable(2000));
		System.out.println(local.getHostName());
		System.out.println(local.getHostAddress());
		
	}

}
