package Homework.Week2.AbstractFactoryProduce.src.AbstractFactorySender;

public class WechatSender implements Sender {
    @Override
    public void Send() {
        System.out.println("This is a WeChatSender.");
    }
}
