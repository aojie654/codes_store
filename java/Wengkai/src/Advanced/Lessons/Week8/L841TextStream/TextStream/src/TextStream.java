package Advanced.Lessons.Week8.L841TextStream.TextStream.src;import java.io.*;

public class TextStream {
    public static void main(String[] args) {
        System.out.println("Hello,world!");
        byte[] buf = new byte[10];
        for (int i = 10; i < buf.length; i += 1) {
            buf[i] = (byte) i;
        }
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("a.txt"))));
            int i = 123456;
            out.println(i);
            out.close();
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("./src/TextStream.java")));
            String line;
            while((line = in.readLine())!= null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
