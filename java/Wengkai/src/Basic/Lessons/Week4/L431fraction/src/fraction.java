package Basic.Lessons.Week4.L431fraction.src;

import java.util.Scanner;

public class fraction {
    public static void main(String[] args) {
        Scanner in0 = new Scanner(System.in);
        int num0 = in0.nextInt();
        if (num0 > 0) {
            double fractionSum = 0;
            for (int i = 1; i <= num0; i += 1) {
                fractionSum += 1.0 / i;
                System.out.print("1/" + i);
                if (i < num0) {
                    System.out.print(" + ");
                }
                if (i % 10 == 0 && i != num0) {
                    System.out.println();
                }
            }
            System.out.println(" = " + fractionSum);
        } else if (num0 != 0) {
            double fractionSum = 0;
            for (int i = -1; i >= num0; i -= 1) {
                fractionSum += 1.0 / i;
                if (i < -1) {
                    System.out.print(" ");
                }
                System.out.print("-1/" + -i);
                if (i % 10 == 0 && i != num0) {
                    System.out.println();
                }
            }
            System.out.println(" = " + fractionSum);
        }
    }
}
