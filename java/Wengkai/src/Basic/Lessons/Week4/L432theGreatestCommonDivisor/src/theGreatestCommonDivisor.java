package Basic.Lessons.Week4.L432theGreatestCommonDivisor.src;

import java.util.Scanner;

public class theGreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner in0 = new Scanner(System.in);
        int num0 = in0.nextInt();
        int num1 = in0.nextInt();
        int remainder0 = 0;
        int temp0 = num0;
        int temp1 = num1;
        while (num1 != 0) {
            remainder0 = num0 % num1;
            num0 = num1;
            num1 = remainder0;
        }
        System.out.println("The GCD of " + temp0 + " and " + temp1 + " is " + num0 + ".");
    }
}
