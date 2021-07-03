package Lessons.Week1.L101_ExtendAnimalDemo04.src.ExtendAnimalDemo04;

public class Dog  extends Animal{
	private static String type="����";
	public Dog(String name){
		super(name,"����");
	}
	public Dog(){
		super();
	}
	
	public  void shout(){	
		StringBuffer shoutStr=new StringBuffer("");
		for(int i=0;i<this.getShoutNum();i++){
			shoutStr.append(this.getSound());
		}
		System.out.println(""+Dog.type+""+this.getName()+""+shoutStr);
	}
}

