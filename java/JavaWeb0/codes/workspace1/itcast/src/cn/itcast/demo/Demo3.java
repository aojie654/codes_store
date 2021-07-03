package cn.itcast.demo;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		String checkCode = "3N2q";
		//用户输入结果要和验证码一致，才能注册成功
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入验证码，3N2q");
		//获取用户输入的验证码
		String ck_user = sc.next();
		//转换为小写
		/*checkCode = checkCode.toLowerCase();
		ck_user  = ck_user.toLowerCase();*/
		System.out.println("用户输入："+ck_user);
		
		//比对字符串是否相等
		boolean flag = checkCode.equalsIgnoreCase(ck_user);
		if(flag){
			System.out.println("注册成功！");
		}else{
			System.err.println("注册失败！");
		}
		
		
		
		
	}
}
