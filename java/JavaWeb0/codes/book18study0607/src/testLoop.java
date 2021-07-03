import java.util.Scanner;

public class testLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (!s.next().equals("!q")) {
            System.out.println("In the loop");
        }
        System.out.println("Out of loop");
    }
}
