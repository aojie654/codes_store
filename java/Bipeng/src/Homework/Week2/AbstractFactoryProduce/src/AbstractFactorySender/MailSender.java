package Homework.Week2.AbstractFactoryProduce.src.AbstractFactorySender;

public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("This is a MailSender.");
    }
}
