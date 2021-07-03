package Homework.Week2.H211ExceptionDemo0.src.ExceptionsDemo0;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ClassA {
    public void methodA(int i) throws IndexOutOfBoundsException {
        int[] num0 = new int[1];
        int num1 = num0[i];
    }

    public void methodB(String s) throws FileNotFoundException {
        FileReader fr0 = new FileReader(s);
    }
}
