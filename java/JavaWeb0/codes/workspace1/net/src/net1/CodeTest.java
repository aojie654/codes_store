package net1;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class CodeTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
	
		
		String  str1 ="%E4%BA%A4%E5%A4%A7%E5%9F%8E%E5%B8%82%E5%AD%A6%E9%99%A2";
		String abc= URLDecoder.decode("%E4%BA%A4%E5%A4%A7%E5%9F%8E%E5%B8%82%E5%AD%A6%E9%99%A2", "UTF-8");
		System.out.println(abc);
		String str = URLEncoder.encode("½»´ó»Û¹È" , "utf-8");
		System.out.println(str);
		System.out.println(str1.endsWith(str));
		
	}

}
