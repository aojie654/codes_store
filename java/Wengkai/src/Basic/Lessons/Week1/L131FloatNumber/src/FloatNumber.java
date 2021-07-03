package Basic.Lessons.Week1.L131FloatNumber.src;

import java.util.Scanner;

public class FloatNumber {

	private static Scanner in0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double foot0 = 0;
		double inch0 = 0;
		double height0 = 0;
		in0 = new Scanner(System.in);
		foot0 = in0.nextInt();
		inch0 = in0.nextInt();
		height0 = (foot0+inch0/12)*0.3048;
		System.out.println(height0);
//		System.out.println(1.2-1.1);
	}

}
