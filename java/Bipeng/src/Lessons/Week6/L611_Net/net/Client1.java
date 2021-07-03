package Lessons.Week6.L611_Net.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {
    public static void main(String[] args) {
        Socket socket0 = null;
        BufferedReader br0 = null;
        try {
            socket0 = new Socket("127.0.0.1", 30000);
            br0 = new BufferedReader(new InputStreamReader(socket0.getInputStream()));
            String line0 = br0.readLine();
            System.out.println("Message from server: " + line0);
        } catch (UnknownHostException e) {
            System.out.println("UnknownHostException!");
        } catch (IOException e) {
            System.out.println("IOException!");
        } finally {
            try {
                br0.close();
                socket0.close();
            } catch (IOException e) {
                System.out.println("IOException!");
            }
        }
    }
}