package demo4;

public class Dog  extends Animal{
	//构造函数，成员变量，方法的可见度被控制！
	private static String type="狗";
	public Dog(String name){
		super(name);
	}
	public Dog(){
		super("小旺");//调用父类的构造函数！
	}
	
	public String getSound() {
		return "汪~";
	}

}

