package demo2;
//信息发送者制造工厂！
public class SendFactory {

	public Sender produceSms(){
		return new SmsSender();
	}
	
	public Sender produceMail(){
		return new MailSender();
	}
	
	//测试工厂方法。
	public static void main(String[] args){
		SendFactory factory = new SendFactory();
		Sender mailSender=factory.produceMail();
		mailSender.send();
		Sender smsSender=factory.produceSms();
		smsSender.send();
	}
}
