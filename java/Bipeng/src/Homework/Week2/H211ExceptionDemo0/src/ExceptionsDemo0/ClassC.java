package Homework.Week2.H211ExceptionDemo0.src.ExceptionsDemo0;

import java.io.FileNotFoundException;

public class ClassC {
    public ClassC(int i0, String s0) {
        try {
            ClassB cb0 = new ClassB(i0, s0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("It occurs IndexOutOfBoundsException when the ClassC called ClassB!");
        } catch (FileNotFoundException e) {
            System.out.println("It occurs FileNotFoundException when the ClassC called ClassB!");
        }
    }

    public static void main(String[] args) {
        System.out.println("=========IndexOutOfBoundsException=============");
        ClassC cc0 = new ClassC(1,"a");
        System.out.println();
        System.out.println("=========FileNotFoundException=============");
        ClassC cc1 = new ClassC(0,"lula");
    }
}
