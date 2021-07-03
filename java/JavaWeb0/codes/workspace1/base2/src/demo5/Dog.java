package demo5;

public class Dog  extends Animal{
	//构造函数，成员变量，方法的可见度被控制！
	private static String type="狗";
	public Dog(String name){
		super(name,"汪~");
	}
	public Dog(){
		super();//调用父类的构造函数！
	}
	
	public  void shout(){	
		StringBuffer shoutStr=new StringBuffer("");
		for(int i=0;i<this.getShoutNum();i++){
			shoutStr.append(this.getSound());
		}
		System.out.println("大家好，我是一只"+Dog.type+"我叫"+this.getName()+"，"+shoutStr);
	}
}

