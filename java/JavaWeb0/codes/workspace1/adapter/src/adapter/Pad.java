package adapter;

public class Pad {
	private Target plug;//有插座
	private String brand;//
	public Pad(String str,Target target){
		this.brand=str;
		plug = target;
	}
	public void work(){//要工作需要先插上电源！将2插头插入插座！
		plug.plug2();
		System.out.println(brand+" pad 插上了电源，开始工作！");
	}
	public void  setPlug(Target plug){
		this.plug=plug;
	}
	public static void main(String[] args){
		//在中国测试！
		Pad pad = new Pad("lenovo",new ChineseSocket());
		pad.work();
		System.out.println("旅行去了美国，笔记本要使用美国插座！");
		//在美国使用适配器！
		AmericanScoket as=new AmericanScoket();
		pad.setPlug(new Adapter(as));//使用适配器，适配美国插座！
		pad.work();
		
		//适配器模式！ 
		
	}
}
