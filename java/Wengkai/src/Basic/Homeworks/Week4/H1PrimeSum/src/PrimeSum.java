package Basic.Homeworks.Week4.H1PrimeSum.src;

import java.util.Scanner;

public class PrimeSum {

	private static Scanner in1;

	public static boolean isPrime(int a) {
		boolean flag = true;
		if (a < 2) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(a); i++) {
				if (a % i == 0) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		in1 = new Scanner(System.in);
		int primeCount0 = 0, primeSum0 = 0, start0 = in1.nextInt(), end0 = in1.nextInt(), num0 = 2;
		if ((start0 > 0 && start0 <= 200) && (end0 > 0 && end0 <= 200)) {
			for (; primeCount0 < end0;num0+=1) {
				if(isPrime(num0)) {
					primeCount0+=1;
					if(primeCount0>=start0) {
						primeSum0+=num0;
					}
				}
			}
		}
		System.out.println(primeSum0);
	}
}