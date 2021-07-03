package Basic.Homeworks.Week1.H1Temperature_FTC.src;

import java.util.Scanner;

public class Temperature_FTC{
    private static Scanner in1;

	public static void main(String[] args) {
        in1 = new Scanner(System.in);
        System.out.println("Input a F temp:");
        int FTemp0 = in1.nextInt();
        int CTemp0 = ((FTemp0-32)*5/9);
        System.out.println("The CTemp is:");
        System.out.println(CTemp0);
    }
}