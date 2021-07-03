package Homework.Week2.H211ExceptionDemo0.src.ExceptionsDemo0;

import java.io.FileNotFoundException;

public class ClassB {
    public ClassB(int i0, String s0) throws FileNotFoundException, IndexOutOfBoundsException {

        ClassA a = new ClassA();
        try {
            System.out.println("MethodA of ClassA was called by ClassB.");
            a.methodA(i0);
            a.methodB(s0);
        } catch (IndexOutOfBoundsException e) {
            throw e;
        }catch (FileNotFoundException e){
            throw e;
        }
    }
}
