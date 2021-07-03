package adapter1;

public class AmericanSocket implements Adaptee{
	@Override
	public void socket3() {
		// TODO Auto-generated method stub
		System.out.println("美国的三孔插座！");
	}

	@Override
	public int  volt110() {
		// TODO Auto-generated method stub
		System.out.println("美国的110V电压！");
		return 110;
	}
}
