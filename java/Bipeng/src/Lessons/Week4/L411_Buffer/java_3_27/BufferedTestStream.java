package Lessons.Week4.L411_Buffer.java_3_27;

import java.io.*;

public class BufferedTestStream {
    public static void main(String[] args) {
        BufferedInputStream bis0 = null;
        PrintStream ps0 = null;
        try {
            bis0 = new BufferedInputStream(new FileInputStream("./src/java_3_27/writePoemAo.txt"));
            ps0 = new PrintStream(new FileOutputStream("./src/java_3_27/writePoemAo_2.txt"));
            byte[] bottle0 = new byte[1024];
            int readNum0;
            while ((readNum0 = bis0.read(bottle0)) > 0) {
                System.out.println(new String(bottle0, 0, readNum0));
                ps0.print(new String(bottle0, 0, readNum0));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("IO exception!");
        }finally {
            try {
                bis0.close();
                ps0.close();
            } catch (IOException e) {
                System.out.println("IO exception!");
            }
        }
    }
}
