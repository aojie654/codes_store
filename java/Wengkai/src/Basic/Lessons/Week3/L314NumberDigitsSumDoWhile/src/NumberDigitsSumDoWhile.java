package Basic.Lessons.Week3.L314NumberDigitsSumDoWhile.src;

import java.util.Scanner;

public class NumberDigitsSumDoWhile {
    public static void main(String[] args) {
        Scanner in0 = new Scanner(System.in);
        int num0 = in0.nextInt();
        int temp0 = num0;
        int digit0 = 0;
        do{
            num0 /= 10;
            digit0 += 1;
        }while (num0 != 0);
        System.out.println("The digit(s) of " + temp0 + " is " + digit0 + ".");
    }
}
