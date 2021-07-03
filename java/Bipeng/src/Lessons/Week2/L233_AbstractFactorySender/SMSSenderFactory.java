package Lessons.Week2.L233_AbstractFactorySender;

public class SMSSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new SMSSender();
    }
}
