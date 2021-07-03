package Lessons.Week6.L611_Net.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MyServer {
    public static List<Socket> list0 = new ArrayList<Socket>();

    public static void main(String[] args) {
        try {
            ServerSocket ss0 = new ServerSocket(30000);
            while(true){
                Socket s0 = ss0.accept();
                list0.add(s0);
                new Thread(new ServerThread(s0)).start();
            }
        } catch (IOException e) {
            System.out.println("IOException!");
        }
    }
}
