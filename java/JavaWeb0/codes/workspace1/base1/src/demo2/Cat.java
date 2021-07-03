package demo2;

import demo1.Test1;

public class Cat {//类中可以有多个构造函数！
	//成员变量
	private String name;
	private int shoutNum;
	public void setShoutNum(int shoutNum) {
		this.shoutNum = shoutNum;
	}
	//无参构造函数！
	protected  Cat(String name){
		this.name=name;//左侧的name 与name不是一个变量。
		this.shoutNum=3;
	}
	//默认的系统会给每个类一个无参的无内容的构造函数。如果你写了构造函数，系统的就取消了！
	public  Cat(){
		this.name="小猫";
		this.shoutNum=3;
	}
	
	//non static方法属于实体对象 Test1类的对象比如t1
	 void shout(){
		//String 不可变字符串
		//StringBuffer类是可变字符串
		StringBuffer shout=new StringBuffer("");
		for(int i=0;i<shoutNum;i++){
			shout.append("喵~");
		}
		System.out.println("我是一只小猫，"+"我叫"+this.name+","+shout);
		
	}
	public static void main(String[] args){
		      //t1是对象
		Cat cat= new Cat();
		cat.shout();
		
		Cat cat2= new Cat("kitty");
		cat2.shout();
		cat2.setShoutNum(9);
		cat2.shout();
	}
}
