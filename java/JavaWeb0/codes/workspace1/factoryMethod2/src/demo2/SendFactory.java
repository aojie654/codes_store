package demo2;
//简单工厂模式 类型2 调用不同方法产生实例对象！
public class SendFactory {
	//工厂类根据需要的类型，返回不同种类的发送者！
	
	public Sender produceMailSender(){
		return new MailSender();
		//实际开发中，构造一个实例要需要很多内容
	}
	public Sender produceSmsSender(){
		return new SmsSender();
		//实际开发中，构造一个实例要需要很多内容
	}
	public static void main(String[] args){
		
		SendFactory factory = new SendFactory();
		Sender sender1=factory.produceMailSender();
		sender1.send();
		Sender sender2=factory.produceSmsSender();
		sender2.send();
	}
}
