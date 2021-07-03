package Lessons.Week6.L611_Net.net;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String[] args) {
        try {
            ServerSocket ss0 = new ServerSocket(30000);
            while(true){
                Socket s0 = ss0.accept();
                PrintStream ps0 = new PrintStream(s0.getOutputStream());
                System.out.println("Server start!");
                ps0.println("Hello Java!"+ s0.getInetAddress());
            }
        } catch (IOException e) {
            System.out.println("IOException!");
        }
    }
}
