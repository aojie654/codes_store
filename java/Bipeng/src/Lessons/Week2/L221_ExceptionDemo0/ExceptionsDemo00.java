package Lessons.Week2.L221_ExceptionDemo0;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo00 {

    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException {
        try {
            int num = Integer.parseInt("adb");
            String s = null;
            s.charAt(0);
            Class.forName("adb");
            FileReader f = new FileReader("a");
            int a = 0;
            int b = 1;
            int c = b / a;
            String[] strs = new String[3];
            strs[3] = "";
        }catch (NumberFormatException | NullPointerException e){
            System.out.println("NumberFormatException or NullPointerException!");
        }catch (ClassNotFoundException e){
            System.out.println("ClassNotFoundException!");
        }catch (FileNotFoundException e){
            System.out.println("FileNotFoundException!");
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException!");
        }catch (Exception e){
            System.out.println("Other Exception!");
            System.out.println(e.toString());
        }

    }
}
