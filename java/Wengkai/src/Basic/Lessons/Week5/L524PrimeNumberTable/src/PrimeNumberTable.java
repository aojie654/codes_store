package Basic.Lessons.Week5.L524PrimeNumberTable.src;

import java.util.Scanner;

public class PrimeNumberTable {
    public static void main(String[] args) {
        Scanner in0 = new Scanner(System.in);
        int[] primes = new int[50];
        primes[0] = 2;
        int cnt = 1;
        MAIN_LOOP:
        for (int x = 3; cnt < primes.length; x += 1) {
            for (int i = 0; i < cnt; i += 1) {
                if (x % primes[i] == 0) {
                    continue MAIN_LOOP;
                }
            }
            primes[cnt] = x;
            cnt += 1;
        }
        for (int i = 0; i < primes.length; i += 1) {
            System.out.print(primes[i] + "\t");
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
    }
}
