package demo1;
//信息发送者制造工厂！
public class SendFactory {
	//produce方法返回Sender的实例。根据type
	public Sender produce(String type){
		if(type.equals("sms")){
			return new SmsSender();//返回一个短信发送者
		}else if(type.equals("mail")){
			return new MailSender();//返回一个邮件发送者			
		}else{
			System.out.println("请输入正确的类型！");
		}
		return null;
	}
	//测试工厂方法。
	public static void main(String[] args){
		SendFactory factory = new SendFactory();
		Sender mailSender=factory.produce("mail");
		mailSender.send();
		Sender smsSender=factory.produce("sms");
		smsSender.send();
		Sender sssSender=factory.produce("sss");
		sssSender.send();
	}
}
