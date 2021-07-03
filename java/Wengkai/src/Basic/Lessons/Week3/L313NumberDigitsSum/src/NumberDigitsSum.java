package Basic.Lessons.Week3.L313NumberDigitsSum.src;

import java.util.Scanner;

public class NumberDigitsSum {
    public static void main(String[] args) {
        Scanner in0 = new Scanner(System.in);
        int num0 = in0.nextInt();
        int temp0 = num0;
        int digit0 = 1;
        while (num0 / 10 != 0) {
            num0 /= 10;
            digit0 += 1;
        }
        System.out.println("The digit(s) of " + temp0 + " is " + digit0 + ".");
    }
}
