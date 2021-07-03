package net1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {
		//InetAddress没有构造函数
		//www.163.com
		try {
			InetAddress inet = InetAddress.getByName("www.163.com");
			boolean bool = inet.isReachable(2000);//是否能访问该域名！
			System.out.println("baidu 是否到达："+bool);
			System.out.println(inet.getHostAddress());
			//System.out.println(inet.getCanonicalHostName());
			
			InetAddress local =InetAddress.getLocalHost();
			boolean bool2 =local.isSiteLocalAddress();
			System.out.println("local :is site "+bool2);
			System.out.println(local.getHostName());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
