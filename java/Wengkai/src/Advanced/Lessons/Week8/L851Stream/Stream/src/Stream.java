package Advanced.Lessons.Week8.L851Stream.Stream.src;import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Stream {
    public static void main(String[] args) {
        try {
            Socket socket0 = new Socket(InetAddress.getByName("localhost"), 12345);
            PrintWriter out = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    socket0.getOutputStream()
                            )
                    )
            );
            out.println("Hello");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            socket0.getInputStream()));
            String line0;
            line0 = in.readLine();
            System.out.println(line0);
            out.close();
            socket0.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
