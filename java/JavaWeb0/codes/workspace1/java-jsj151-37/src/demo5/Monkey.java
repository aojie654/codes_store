package demo5;

public class Monkey extends Animal{
	//无参构造函数！
	protected  Monkey(String name){
		super(name);//父类构造函数！
		
	}
	//默认的系统会给每个类一个无参的无内容的构造函数。如果你写了构造函数，系统的就取消了！
	public  Monkey(){
		super();
	}
}
