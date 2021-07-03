package cn.itcast.demo;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		
		int[] arr = new int[]{2,32,5,51,1};
		System.out.println("排序之前：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//排序
		Arrays.sort(arr);
		
		System.out.println("排序之后：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
