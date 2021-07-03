package Homework.Week2.AbstractFactoryProduce.src.AbstractFactorySender;

public class MailSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
