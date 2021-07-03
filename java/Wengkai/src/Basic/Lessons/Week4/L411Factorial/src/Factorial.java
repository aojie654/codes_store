package Basic.Lessons.Week4.L411Factorial.src;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in0 = new Scanner(System.in);
        int num0 = in0.nextInt();
        if (num0 >= 0) {
            int factorial0;
            if (num0 != 0) {
                factorial0 = 1;
                for (int i = num0; i > 1; i--) {
                    factorial0 *= i;
                }
            } else {
                factorial0 = 0;
            }
            System.out.println(factorial0);
        }
    }
}
