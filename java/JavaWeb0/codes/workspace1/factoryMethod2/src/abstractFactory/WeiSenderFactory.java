package abstractFactory;

public class WeiSenderFactory implements Provider{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new WeiSender();
	}

}
