package Basic.Lessons.Week7.L711isPrime.src;

import java.util.Scanner;

public class isPrime {
    public static boolean isPrime(int num0) {
        boolean isPrime0 = true;
        if (num0 > 1) {
            for (int i = 2; i <= (int) Math.sqrt(num0); i += 1) {
                if (num0 % i == 0) {
                    isPrime0 = false;
                    break;
                }
            }
        }
        return isPrime0;
    }

    public static void main(String[] args) {
        Scanner in0 = new Scanner(System.in);
        int num0 = in0.nextInt();
        if (isPrime(num0)) {
            System.out.println(num0 + " is a prime number.");
        } else {
            System.out.println(num0 + " is not a prime number.");
        }
    }
}

