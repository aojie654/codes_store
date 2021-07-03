package Lessons.Week6.L611_Net.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientThread implements Runnable {
    private Socket s0;
    private BufferedReader br0 = null;

    public ClientThread(Socket s) {
        this.s0 = s;
        try {
            br0 = new BufferedReader(new InputStreamReader(s0.getInputStream()));
        } catch (IOException e) {
            System.out.println("IOException!");
        }
    }

    @Override
    public void run() {
        String content0;
        try {
            while ((content0 = br0.readLine()) != null) {
                System.out.println("The message from server: " + content0);
            }
        }catch (IOException e){
            System.out.println("IOException!");
        }
    }
}
