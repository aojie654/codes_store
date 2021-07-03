package Lessons.Week2.L233_AbstractFactorySender;

public class MailSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
