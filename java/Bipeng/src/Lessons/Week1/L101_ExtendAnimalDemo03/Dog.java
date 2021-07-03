package Lessons.Week1.L101_ExtendAnimalDemo03.src.ExtendAnimalDemo03;

public class Dog {
	 String name;
	private int shoutNum;
	public Dog(String name){
		this.name=name;
		this.shoutNum=3;
	}
	public Dog(){
		name="����";
		this.shoutNum=3;
	}
	
	public void setShoutNum(int shoutNum) {
		this.shoutNum = shoutNum;
	}
	public  void shout(){	
		StringBuffer shoutStr=new StringBuffer("");
		for(int i=0;i<shoutNum;i++){
			shoutStr.append("��~");
		}
		System.out.println("��Һ�,����һֻ"+this.name+"��"+shoutStr);
	}
	
	public static void main(String[] args){
		Dog cat1 = new Dog();
		cat1.shout();
		Dog cat2 = new Dog("��");
		cat2.shout();
		Dog cat3 = new Dog("��");
		cat3.setShoutNum(9);
		cat3.shout();
	}

}

