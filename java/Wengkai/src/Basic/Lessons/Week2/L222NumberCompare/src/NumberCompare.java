package Basic.Lessons.Week2.L222NumberCompare.src;

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {
        Scanner in0 = new Scanner(System.in);

        int num0 = in0.nextInt();
        int num1 = in0.nextInt();
        int max0;

        if (num0 > num1) {
            max0 = num0;
        } else {
            max0 = num1;
        }
        System.out.println("Max of " + num0 + " and " + num1 + " is " + max0 + ".");
    }
}
