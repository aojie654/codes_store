package Lessons.Week2.L221_ExceptionDemo0;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionDemo1 {
    public static void methodA() throws FileNotFoundException {
//        We can do nothing for Runtime Exception.
        FileReader f;
        try {
            f = new FileReader("a");
        } catch (FileNotFoundException e) {
            System.out.println("Todo exception of methodA and throw!");
            throw e;
        }
    }

    public static void methodB() {
        try {
            methodA();
        } catch (FileNotFoundException e) {
            System.out.println("Todo exception of methodA");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        methodB();
        try {
            methodA(); //Can not throw the exception!
        } catch (FileNotFoundException e) {
            System.out.println("Can not throw the exception or the program will be shutdown!");
//            e.printStackTrace();
        } finally {
            System.out.println("Program is running on.");
        }
    }
}
