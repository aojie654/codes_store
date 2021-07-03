package abstractFactory;



public class SendWeixinFactory implements Provider{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new WeixinSender();
	}
}
