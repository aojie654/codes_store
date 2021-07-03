package Lessons.Week3.L322_Adapter.java_3_22.adapter;

public class Adapter implements Target{
	private Adaptee adaptee;//要适配的美国的3头插座！
	
	public Adapter(Adaptee adaptee){
		this.adaptee = adaptee;//对美国插座初始化。
	}

	@Override
	public void plug2() {//适配方法！中国的Target中的2头插座！
		// 要使用次适配器，将美国的3孔插座，转换成2孔插座。让中国的2头插头插上去！
		System.out.println("使用转换插头，将中国的2头插头转换成3头，插入美国插座！");
		adaptee.socket3();
	}
}
