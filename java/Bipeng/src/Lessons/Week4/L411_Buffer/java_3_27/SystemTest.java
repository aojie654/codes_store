package Lessons.Week4.L411_Buffer.java_3_27;

import java.io.*;

public class SystemTest {
    public static void main(String[] args) {
        InputStreamReader isr0 = new InputStreamReader(System.in);
        BufferedReader br0 = new BufferedReader(isr0);
        String line0 = null;
        try {
            System.setOut(new PrintStream(new FileOutputStream("./src/java_3_27/Console.txt")));
            while ((line0 = br0.readLine()) != null) {
                if (line0.equals("exit()")) {
                    System.exit(1);
                }
                System.out.println(line0);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("IO exception!");
        }
    }
}
