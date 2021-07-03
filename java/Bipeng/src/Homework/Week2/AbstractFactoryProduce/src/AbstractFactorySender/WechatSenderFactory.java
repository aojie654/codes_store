package Homework.Week2.AbstractFactoryProduce.src.AbstractFactorySender;

public class WechatSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new WechatSender();
    }
}
