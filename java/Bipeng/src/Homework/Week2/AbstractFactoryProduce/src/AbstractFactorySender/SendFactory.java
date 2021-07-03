package Homework.Week2.AbstractFactoryProduce.src.AbstractFactorySender;

public class SendFactory {
    public static Sender produceMailSender() {
        return new MailSender();
    }
    public static Sender produceSMSSender() {
        return new SMSSender();
    }

    public static void main(String[] args) {
//        SendFactory sf0 = new SendFactory();
        Sender sd0 = SendFactory.produceMailSender();
        sd0.Send();
        Sender sd1 = SendFactory.produceSMSSender();
        sd1.Send();
    }
}
