package cn.itcast.demo;

public class Demo2 {

	public static void main(String[] args) {
		//第二种方式
		String str = "Hello hello World !";
		//第一种方式
		String str2 = new String("Hello hello World !");
		System.out.println(str);
		
		System.out.println(str2);
		
		System.out.println("----------------");
		
		int index = str.indexOf('h');
		System.out.println(index);
		System.out.println("-----------");
		
		int length = str.length();
		System.out.println(length);
		System.out.println("-------------");
		char ch = str.charAt(7);
		System.out.println(ch);
		System.out.println("------------------");
		
		String s = str.toUpperCase();
		System.out.println(s);
		
		/*
		 * 打印字符串中的每个字符
		 */
		for (int i = 0; i < str.length(); i++) {
			
			System.out.println(str.charAt(i));
		}
	}
}
