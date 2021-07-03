package Advanced.Lessons.Week8.L811CatchException.src.CatchException;

import java.util.Scanner;

public class CatchArrayOutOfBoundException {
    public static void main(String[] args) {
        int[] a = new int[10];
        int idx;
        Scanner in = new Scanner(System.in);
        idx = in.nextInt();
        try{
            a[idx] = 10;
            System.out.println("Hello");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("It occurs ArrayIndexOutOfBoundsException!");
        }
        System.out.println("Running....");
    }
}
