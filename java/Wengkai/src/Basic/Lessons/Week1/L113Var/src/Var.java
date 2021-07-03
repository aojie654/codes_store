package Basic.Lessons.Week1.L113Var.src;

import java.util.Scanner;

public class Var {

	private static Scanner in1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price;
		in1 = new Scanner(System.in);
		System.out.println("Input a number to use:");
		price = in1.nextInt();
		System.out.println("100-" + price + "="+(100-price));
	}
}
