package Lessons.Week6.L611_Net.net;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket s0 = new Socket("127.0.0.1", 30000);
            new Thread(new ClientThread(s0));
            PrintStream ps0 = new PrintStream(s0.getOutputStream());

            Scanner scanner0 = new Scanner(System.in);
            while(scanner0.hasNext()){
                String str0 = scanner0.next();
                if (str0.endsWith("exit")){
                    break;
                }else {
                    ps0.println(str0);
                }
            }
            scanner0.close();
            ps0.close();
            s0.close();
        } catch (IOException e) {
            System.out.println("IOException!");
        }
    }
}
