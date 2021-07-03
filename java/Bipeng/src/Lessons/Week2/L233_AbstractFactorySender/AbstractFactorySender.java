package Lessons.Week2.L233_AbstractFactorySender;

public class AbstractFactorySender {
    public static void main(String[] args) {
        Provider p0 = new SMSSenderFactory();
        Sender s0 = p0.produce();
        s0.Send();
        Provider p1 = new WechatSenderFactory();
        Sender s1 = p1.produce();
        s1.Send();
    }
}
