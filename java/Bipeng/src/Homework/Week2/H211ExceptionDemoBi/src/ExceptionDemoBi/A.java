package Homework.Week2.H211ExceptionDemoBi.src.ExceptionDemoBi;

import java.io.FileNotFoundException;

public class A {
    public void methodA() throws ArithmeticException{
        try{
            int a=0;
            int b=1;
            int c=b/a;
        }catch (ArithmeticException e){
            System.out.println("MethodA occurs exception!");
            throw e;
        }
    }
    public void methodB() throws FileNotFoundException{

    }
}
