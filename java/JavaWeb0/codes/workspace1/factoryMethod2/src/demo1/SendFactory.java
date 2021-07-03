package demo1;
//简单工厂模式 类型1
public class SendFactory {
	//工厂类根据需要的类型，返回不同种类的发送者！
	Sender s = new MailSender();
	
	public Sender produce(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}else{
			System.out.println("请输入正确的类型！");
		}
		return null;
	}
	public static void main(String[] args){
		
		SendFactory factory = new SendFactory();
		Sender sender =factory.produce("mail");
		sender.send();
		Sender sender2 =factory.produce("sms");
		sender2.send();
		Sender sender3 =factory.produce("smss");
		if(sender3!=null){
			sender3.send();
		}
	}
}
