package Basic.Homeworks.Week4.H2Pinyin.src;

import java.util.Scanner;

public class Pinyin {

	private static Scanner in1;

	public static void main(String[] args) {
		in1 = new Scanner(System.in);
		int num0 = in1.nextInt();
		if (num0 >= -100000 && num0 <= 100000) {
			int numDigit0 = 0, temp0 = 0, pow0 = 0;
			if (num0 < 0) {
				System.out.print("fu ");
				num0 = Math.abs(num0);
			}
			temp0 = num0;
			for (; temp0 > 0; numDigit0 += 1) {
				temp0 /= 10;
			}
			for (; numDigit0 > 0; numDigit0 -= 1) {
				pow0 = (int) Math.pow(10, numDigit0 - 1);
				switch (num0 / pow0) {
				case 0:
					System.out.print("ling");
					break;
				case 1:
					System.out.print("yi");
					break;
				case 2:
					System.out.print("er");
					break;
				case 3:
					System.out.print("san");
					break;
				case 4:
					System.out.print("si");
					break;
				case 5:
					System.out.print("wu");
					break;
				case 6:
					System.out.print("liu");
					break;
				case 7:
					System.out.print("qi");
					break;
				case 8:
					System.out.print("ba");
					break;
				case 9:
					System.out.print("jiu");
					break;
				}
				if (pow0 > 1) {
					System.out.print(" ");
				}
				num0 %= pow0;
			}
		}
	}
}
