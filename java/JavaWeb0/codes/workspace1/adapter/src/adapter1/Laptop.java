package adapter1;
//作业，在对象适配器插座基础上！完成对电压的适配工作！
//在此基础上，实现电源电压的适配。中国是220V.美国的情况是110V
//使用适配器完成电压适配工作。提供220V电压。将美国的110V*2
public class Laptop {
	private String brand;
	private Target plug2;
	public Laptop(String brand,Target plug){
		this.brand=brand;
		this.plug2=plug;
	}
	public void setTarget(Target plug){
		this.plug2=plug;
	}
	public void work(){
		System.out.println("接上电源！");
		plug2.socket2();
		System.out.println("实际工作电压"+plug2.volt220());
		System.out.println(brand+" 电脑！开始工作！");
	}
	public static void main(String[] args){
		
		//在中国使用！
		Target chineseSocket = new ChineseSocket();
		Laptop book = new Laptop("lenovo",chineseSocket);
		book.work();
		System.out.println("--------------------");
		//在美国使用
		Adaptee americanSocket = new AmericanSocket();
		Adapter adapter = new Adapter(americanSocket);
		book.setTarget(adapter);//使用适配器插线板
		book.work();
	}
}
