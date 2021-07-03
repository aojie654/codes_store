package demo4;

public class Monkey extends Animal{
	private static String type="猴子";
	public Monkey(String name){
		super(name);
	}
	public Monkey(){
		super();//调用父类的构造函数！
	}
	
	
	public void shout(){
		System.out.println("我是猴子！"+this.getSound());
	}//抽象方法！动物怎么叫不知道。但动物会叫！
}
