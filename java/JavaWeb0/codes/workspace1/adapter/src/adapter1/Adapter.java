package adapter1;

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
	public int volt220() {
		// TODO Auto-generated method stub
		System.out.println("使用适配器，适配美国110V电压！提供了220伏电压！");
		int volt = adaptee.volt110()*2;//使用了美国的110电压！
		System.out.println("使用了美国的110V电压,并进行了变压操作！得到工作电压"+volt+"伏特");
		return volt;
	}
}
