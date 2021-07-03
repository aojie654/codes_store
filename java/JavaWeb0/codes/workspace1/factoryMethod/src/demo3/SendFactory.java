package demo3;
//信息发送者制造工厂！
public class SendFactory {
	
	public static Sender produceSms(){
		return new SmsSender();
	}
	
	public static Sender produceMail(){
		return new MailSender();
	}
	
	//测试工厂方法。
	public static void main(String[] args){
		//实际使用中，静态的方式最常用！！
		Sender mailSender=SendFactory.produceMail();
		mailSender.send();
		Sender smsSender=SendFactory.produceSms();
		smsSender.send();
	}
}
