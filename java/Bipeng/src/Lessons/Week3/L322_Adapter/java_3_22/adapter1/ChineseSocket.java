package Lessons.Week3.L322_Adapter.java_3_22.adapter1;

public class ChineseSocket implements Target{

	@Override
	public void socket2() {
		// TODO Auto-generated method stub
		System.out.println("中国的两孔插座！");
	}

	@Override
	public String voltage() {
		return "中国的220V电压";
	}

}
