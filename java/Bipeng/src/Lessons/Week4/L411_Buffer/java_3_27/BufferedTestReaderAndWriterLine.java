package Lessons.Week4.L411_Buffer.java_3_27;

import java.io.*;

public class BufferedTestReaderAndWriterLine {
    public static void main(String[] args) {
        BufferedReader br0 = null;
        PrintWriter pw0 = null;
        try {
            br0 = new BufferedReader(new FileReader("./src/java_3_27/writePoemAo.txt"));
            pw0 = new PrintWriter(new FileWriter("./src/java_3_27/writePoemAo_2.txt"));
            String line0;
            while ((line0 = br0.readLine()) != null) {
                pw0.print(line0);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("IO exception!");
        } finally {
            try {
                br0.close();
                pw0.close();
            } catch (IOException e) {
                System.out.println("IO exception!");
            }
        }
    }
}
