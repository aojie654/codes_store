package Basic.Lessons.Week1.L122Input.src;

import java.util.Scanner;

public class Input {
	private static Scanner in1;

	public static void main(String[] args) {
		in1 = new Scanner(System.in);
		
		System.out.println("Hello!");
		System.out.println("This is "+in1.nextLine());
	}
}
