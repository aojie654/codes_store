package demo3;
//简单工厂模式 类型3 静态简单工厂模式 平时常用的方式！
public class SendFactory {
	//工厂类根据需要的类型，返回不同种类的发送者！
	
	public static Sender produceMailSender(){
		return new MailSender();
		//实际开发中，构造一个实例要需要很多内容
	}
	public static Sender produceSmsSender(){
		return new SmsSender();
		//实际开发中，构造一个实例要需要很多内容
	}
	public static void main(String[] args){
		//使用类名生产产品！
		Sender sender1=SendFactory.produceMailSender();
		sender1.send();
		Sender sender2=SendFactory.produceSmsSender();
		sender2.send();
	}
}
