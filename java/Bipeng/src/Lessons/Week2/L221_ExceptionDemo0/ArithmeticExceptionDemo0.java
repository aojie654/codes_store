package Lessons.Week2.L221_ExceptionDemo0;

public class ArithmeticExceptionDemo0 {
    public static void main(String[] args) {
        int scores = 0;
        System.out.println("Hello everyone!");
        System.out.println("Let's play basketball!");

        try {
//            Tou Lan 1
            int a = 0;
            int b = 1;
            double d = 1.0/0;
//            int c = 1/0;
            System.out.println(d);
//            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("In! +2 scores!");
            scores += 2;
// Math exception
        } finally {
            System.out.println("Play for once!");
        }
        try {
//            Tou Lan 2
//            int a = Integer.parseInt("abc");
        } catch (ArithmeticException e) {
            System.out.println("In! +2 scores!");
            scores += 2;
// Math exception
        } finally {
//            Weather occurs the exceptions or not it will excute.
            System.out.println("Play for once!");
        }
        System.out.println("Scores is " + scores);
    }
}
