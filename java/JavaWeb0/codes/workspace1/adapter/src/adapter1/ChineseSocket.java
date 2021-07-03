package adapter1;

public class ChineseSocket implements Target{

	@Override
	public void socket2() {
		// TODO Auto-generated method stub
		System.out.println("中国的两孔插座！");
	}

	@Override
	public int volt220() {
		// TODO Auto-generated method stub
		System.out.println("中国的220V电压！");
		return 220;
	}

}
