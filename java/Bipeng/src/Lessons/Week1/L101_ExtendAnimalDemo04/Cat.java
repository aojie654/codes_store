package Lessons.Week1.L101_ExtendAnimalDemo04.src.ExtendAnimalDemo04;

public class Cat extends Animal{
	private static String type="è��";
	public Cat(String name){
		super(name,"����");
	}
	public Cat(){
		super();
	}
	
	public  void shout(){	
		StringBuffer shoutStr=new StringBuffer("");
		for(int i=0;i<this.getShoutNum();i++){
			shoutStr.append(this.getSound());
		}
		System.out.println("��Һã�����һֻ"+Cat.type+"�ҽ�"+this.getName()+"��"+shoutStr);
	}
}

