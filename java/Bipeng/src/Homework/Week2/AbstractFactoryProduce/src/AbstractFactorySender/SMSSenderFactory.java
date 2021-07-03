package Homework.Week2.AbstractFactoryProduce.src.AbstractFactorySender;

public class SMSSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new SMSSender();
    }
}
