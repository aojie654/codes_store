package Lessons.Week2.L221_ExceptionDemo0;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionDemo0 {
    public static void main(String[] args) { //throws FileNotFoundException{ //To throw the exception
        FileReader f;
        try {
            System.out.println("a is not found!");
            f = new FileReader("a");
        } catch (FileNotFoundException e) {
            System.out.println("File is not found!");
//            throw e;
        } finally {
            System.out.println("Program is running on.");
        }
    }
}
