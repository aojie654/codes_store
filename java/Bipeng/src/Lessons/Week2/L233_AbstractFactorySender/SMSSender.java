package Lessons.Week2.L233_AbstractFactorySender;

public class SMSSender implements Sender {
    @Override
    public void Send() {
        System.out.println("This is a SMSSender.");
    }
}
