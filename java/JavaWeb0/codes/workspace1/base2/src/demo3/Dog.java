package demo3;

public class Dog  extends Animal{
	//构造函数，成员变量，方法的可见度被控制！
	
	public Dog(String name){
		super(name,"汪~","狗");
	}
	public Dog(){
		super();//调用父类的构造函数！
	}
}

