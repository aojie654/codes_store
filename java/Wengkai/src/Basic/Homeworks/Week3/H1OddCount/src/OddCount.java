package Basic.Homeworks.Week3.H1OddCount.src;

import java.util.Scanner;

public class OddCount {

	private static Scanner in1;

	public static void main(String[] args) {
		in1 = new Scanner(System.in);
		int[] num = new int[9999];
		int countOdd0 = 0, countEven0 = 0;
		for (int i = 0; i < num.length; i += 1) {
			int temp0 = in1.nextInt();
			if (temp0 > 0 && temp0 <= 100000) {
				num[i] = temp0;
				if (num[i] % 2 != 0) {
					countOdd0 += 1;
				}else {
					countEven0 +=1; 
				}
			} else if (temp0 == -1) {
				break;
			} else {
				i -= 1;
			}
		}
		System.out.println(countOdd0 + " "+countEven0);
	}
}