package demo4;

public class Cat extends Animal{
	//构造函数，成员变量，方法的可见度被控制！
	public static String type="猫";
	public Cat(String name){
		super(name);
	}
	public Cat(){
		super("小咪");//调用父类的构造函数！
	}
	public String getSound() {
		return "喵~";
	}

	
	public void catchRice(){
		System.out.println("抓到一只舒克");
	}
}

