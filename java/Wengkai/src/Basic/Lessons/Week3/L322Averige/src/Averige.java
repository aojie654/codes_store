package Basic.Lessons.Week3.L322Averige.src;

import java.util.Scanner;

public class Averige {
    public static void main(String[] args) {
        Scanner in0 = new Scanner(System.in);
        double num0 = 0;
        int count0 = 0;
        double sum0 = 0;
        double avg0 = 0;
        //        num0 = in0.nextDouble();
//        while (num0 != -1) {
//            sum0 += num0;
//            count0 += 1;
//            num0 = in0.nextDouble();
//        }
        do {
            num0 = in0.nextDouble();
            sum0 += num0;
            count0 += 1;
        } while (num0 != -1);
        avg0 = sum0 / count0;
        if (count0 > 0) {
            System.out.println(avg0);
        }
    }
}
