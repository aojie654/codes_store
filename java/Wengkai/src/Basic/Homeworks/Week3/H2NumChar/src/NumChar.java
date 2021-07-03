package Basic.Homeworks.Week3.H2NumChar.src;

import java.util.Scanner;

public class NumChar {
	private static Scanner in1;

	public static void main(String[] args) {
		in1 = new Scanner(System.in);
		int numDigit0 = 1, numChar0 = 0, num0 = in1.nextInt();
		for (; num0 / 10 != 0; numDigit0 += 1) {
			if ((num0 % 10) % 2 == numDigit0 % 2) {
				numChar0 += Math.pow(2, numDigit0 - 1);
			}
			num0 /= 10;
		}
		System.out.println(numChar0);
	}
}
