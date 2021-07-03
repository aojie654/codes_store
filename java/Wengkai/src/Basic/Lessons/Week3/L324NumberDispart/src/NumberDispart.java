package Basic.Lessons.Week3.L324NumberDispart.src;

import java.util.Scanner;

public class NumberDispart {
    public static void main(String[] args) {
        Scanner in0 = new Scanner(System.in);
        int num0 = in0.nextInt();
        int temp0 = num0;
        int num1 = 0;
        do {
            num1 = num1 * 10 + temp0 % 10;
            temp0 /= 10;
        } while (temp0 != 0);
        System.out.println(num1);
    }
}
