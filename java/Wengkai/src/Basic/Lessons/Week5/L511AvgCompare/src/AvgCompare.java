package Basic.Lessons.Week5.L511AvgCompare.src;

import java.util.Scanner;

public class AvgCompare {

    public static void main(String[] args) {
        Scanner in0 = new Scanner(System.in);
        double num0;
        double[] numersX = new double[100];
        int count0 = 0;
        double sum0 = 0;
        double avg0;
        num0 = in0.nextDouble();
        while (num0 != -1) {
            numersX[count0] = num0;
            sum0 += num0;
            count0 += 1;
            num0 = in0.nextDouble();
        }
        avg0 = sum0 / count0;
        if (count0 > 0) {
            for (int i = 0; i < count0; i += 1) {
                if (numersX[i] > avg0) {
                    System.out.println(numersX[i]);
                }
            }
        }
    }
}