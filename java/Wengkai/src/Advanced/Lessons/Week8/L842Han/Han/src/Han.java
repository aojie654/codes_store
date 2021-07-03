package Advanced.Lessons.Week8.L842Han.Han.src;import java.io.*;

public class Han {
    public static void main(String[] args) {
        System.out.println("Hello,world!");
        byte[] buf = new byte[10];
        for (int i = 10; i < buf.length; i += 1) {
            buf[i] = (byte) i;
        }
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./a.txt"))));
            int i = 123456;
            out.println(i);
            out.close();
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("./GB.txt")));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
