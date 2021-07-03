package demo3;

//避免重复！ Dog 与Cat重复太多了！
public class Dog extends Animal{//类中可以有多个构造函数！
	
	//无参构造函数！
	protected  Dog(String name){
		super(name);
	}
	//默认的系统会给每个类一个无参的无内容的构造函数。如果你写了构造函数，系统的就取消了！
	public  Dog(){
		super();
	}
	@Override
	public void shout() {
		//String 不可变字符串
		//StringBuffer类是可变字符串
		StringBuffer shout=new StringBuffer("");
		for(int i=0;i<this.getShoutNum();i++){
			shout.append("汪~");
		}
		System.out.println("我是一只小狗，"+"我叫"+this.getName()+","+shout);	
	}
	
}
