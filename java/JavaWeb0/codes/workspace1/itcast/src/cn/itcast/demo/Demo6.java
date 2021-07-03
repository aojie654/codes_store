package cn.itcast.demo;

import java.util.Random;

public class Demo6 {

	public static void main(String[] args) {
		/*
		 * 生成一个验证码 ： 4位  大写字母 小写字母 数字
		 * 1,定义一个字符串包含所有的大写字母 小写字母 数字
		 * 2.生成一个随机角标
		 * 3.获取4次字符
		 * 
		 */
		//1.准备数据源
		String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		//2.生成随机角标
		Random ran = new Random();
		for (int i = 0; i < 4; i++) {
			int index = ran.nextInt(str.length() - 1);
			//3.获取字符
			char ch = str.charAt(index);
			System.out.print(ch);
		}
		
	}
}
