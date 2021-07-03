package demo4;

public abstract class  Animal {
	private String sound;
	public String getName() {
		return name;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}
	private String name;
	private int shoutNum;
	public int getShoutNum() {
		return shoutNum;
	}

	public void setShoutNum(int shoutNum) {
		this.shoutNum = shoutNum;
	}
	
	public Animal(){
		name="动物";
		this.shoutNum=3;
		this.sound="~";
	}
	
	public Animal(String name){
		this.name=name;
		this.shoutNum=3;
	
	}
	public void shout(){
	//	System.out.println("我是动物！");
		
		StringBuffer shoutStr=new StringBuffer("");
		for(int i=0;i<this.getShoutNum();i++){
			shoutStr.append(this.getSound());
		}
		System.out.println("大家好，我是一只"+Cat.type+"我叫"+this.getName()+"，"+shoutStr);
		
	}//抽象方法！动物怎么叫不知道。但动物会叫！
}
