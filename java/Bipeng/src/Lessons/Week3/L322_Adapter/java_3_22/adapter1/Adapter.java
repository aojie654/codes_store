package Lessons.Week3.L322_Adapter.java_3_22.adapter1;

public class Adapter implements Target{
	//对象适配器模式！
	private Adaptee adaptee;
	//在构造函数中初始化适配器！
	public Adapter(Adaptee adaptee){
		this.adaptee=adaptee;
	}
	@Override
	public void socket2() {//使用适配器包装了原来的方法！
		// TODO Auto-generated method stub
		System.out.println("使用适配器，适配三孔插座！提供了希望的2孔插座！");
		adaptee.socket3();//使用了美国的3孔插座！
		System.out.println("使用了美国的3孔插座！");
	}

	@Override
	public String voltage() {
		System.out.println("使用适配器，适配220V电压！提供了希望的110V！");
		adaptee.voltage();//使用了美国的110V电压！
		return "美国的110V电压";
	}

}
