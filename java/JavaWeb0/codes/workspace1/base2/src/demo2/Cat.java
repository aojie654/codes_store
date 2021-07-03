package demo2;

public class Cat {
	//构造函数，成员变量，方法的可见度被控制！
	 String name;
	private int shoutNum;
	public Cat(String name){
		this.name=name;
		this.shoutNum=3;
	}
	public Cat(){
		name="小猫";
		this.shoutNum=3;
	}
	
	public void setShoutNum(int shoutNum) {
		this.shoutNum = shoutNum;
	}
	public  void shout(){	
		StringBuffer shoutStr=new StringBuffer("");
		for(int i=0;i<shoutNum;i++){
			shoutStr.append("喵~");
		}
		System.out.println("大家好，我是一只猫,"+"我叫"+this.name+"，"+shoutStr);
	}
	
	public static void main(String[] args){
		Cat cat1 = new Cat();
		cat1.shout();
		Cat cat2 = new Cat("咪咪");
		cat2.shout();
		Cat cat3 = new Cat("大猫");
		cat3.setShoutNum(9);
		cat3.shout();
	}

}

