package Basic.Lessons.Week5.L521NumberCount.src;

import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        x = in.nextInt();
        while (x != -1) {
            if (x >= 0 && x <= 9) {
                numbers[x] += 1;
            }
            x = in.nextInt();
        }
        for (int i = 0; i < numbers.length; i += 1) {
            System.out.print(i + ":" + numbers[i] + "\t");
        }
    }
}
