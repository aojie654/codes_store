package Basic.Lessons.Week2.L221Age.src;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        final int MINOR = 35;

        System.out.print("Input your Age: ");
        Scanner in0 = new Scanner(System.in);

        int age0 = in0.nextInt();

        System.out.println("Your age is: "+age0+".");
        if(age0 < MINOR){
            System.out.println("Young is good!");
        }

        System.out.println("Your sprite state is depends on your age.");
    }
}
