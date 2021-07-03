package Lessons.Week2.L233_AbstractFactorySender;

public class WechatSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new WechatSender();
    }
}
