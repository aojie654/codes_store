package cn.itcast.demo;

import java.util.Random;

public class Demo5 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int se_1 = ran.nextInt(6) + 1;// 1 - 6
		int se_2 = ran.nextInt(6) + 1;// 1 - 6
		
		System.out.println("第一个骰子的点数："+se_1);
		System.out.println("第二个骰子的点数："+se_2);
		int total = se_1 + se_2;
		
		if(total > 7){
			System.out.print("开的是：");
			System.out.println("大");
			System.out.println();
		}else if(total < 7){
			System.out.print("开的是：");
			System.out.println("小");
			System.out.println();
		}else {
			System.out.print("开的是：");
			System.out.println("杀");
			System.out.println();
		}
		
		
		
	}
}
