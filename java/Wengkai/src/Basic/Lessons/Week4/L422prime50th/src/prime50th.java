package Basic.Lessons.Week4.L422prime50th.src;

public class prime50th {
    public static void main(String[] args) {
        int isPrime0;
        int count0 = 0;
        for (int i = 2; count0 < 50; i += 1) {
            isPrime0 = 1;
            for (int j = 2; j <= (int) Math.sqrt(i); j += 1) {
                if (i % j == 0) {
                    isPrime0 = 0;
                    break;
                }
            }
            if (isPrime0 == 1) {
                count0 += 1;
                System.out.print(i + "\t");
                if (count0 % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
