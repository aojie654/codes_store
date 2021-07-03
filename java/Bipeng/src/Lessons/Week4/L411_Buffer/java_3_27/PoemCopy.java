package Lessons.Week4.L411_Buffer.java_3_27;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PoemCopy {
    public static void main(String[] args) {
        try {
            //字符输入流
            FileReader fr0 = new FileReader("./src/java_3_27/writePoemBi.txt");
            //字符输出流
            FileWriter fw0 = new FileWriter("./src/java_3_27/writePoemAo.txt");
            int read = fr0.read();
            while (read != -1) {
                fw0.write(read);
                read = fr0.read();
            }
            fr0.close();
            fw0.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("IO Exception!");
        }

    }
}
