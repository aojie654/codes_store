package Basic.Lessons.Week5.L522NumberFind.src;

import java.util.Scanner;

public class NumberFind {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] numberS = {15, 20, 30, 2, 8, 76, 91, 33, 64, 25};
        int loc = -1;
        for (int i = 0; i < numberS.length; i += 1) {
            if (num == numberS[i]) {
                loc = i + 1;
                break;
            }
        }
        System.out.println(loc);
    }
}
