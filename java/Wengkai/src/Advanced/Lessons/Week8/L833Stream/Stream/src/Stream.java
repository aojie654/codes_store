package Advanced.Lessons.Week8.L833Stream.Stream.src;import java.io.*;

public class Stream {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        byte[] buf = new byte[10];
        for (int i = 0; i < buf.length; i += 1) {
            buf[i] = (byte) i;
        }
        try {

            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("a.dat")));
//            int i = 0xcafebabe;
            int i = 123456;
            out.writeInt(i);
            out.close();
            DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("a.dat")));
            int j = in.readInt();
            System.out.println(j);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
