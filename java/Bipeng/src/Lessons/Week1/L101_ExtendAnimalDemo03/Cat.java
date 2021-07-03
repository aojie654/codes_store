package Lessons.Week1.L101_ExtendAnimalDemo03.src.ExtendAnimalDemo03;

public class Cat {
	 String name;
	private int shoutNum;
	public Cat(String name){
		this.name=name;
		this.shoutNum=3;
	}
	public Cat(){
		name="è��";
		this.shoutNum=3;
	}
	
	public void setShoutNum(int shoutNum) {
		this.shoutNum = shoutNum;
	}
	public  void shout(){	
		StringBuffer shoutStr=new StringBuffer("");
		for(int i=0;i<shoutNum;i++){
			shoutStr.append("~");
		}
		System.out.println("��Һ�,"+"����"+this.name+"��"+shoutStr);
	}
	
	public static void main(String[] args){
		Cat cat1 = new Cat();
		cat1.shout();
		Cat cat2 = new Cat("С��");
		cat2.shout();
		Cat cat3 = new Cat("Сè");
		cat3.setShoutNum(9);
		cat3.shout();
	}

}

