package demo4;

public abstract class Animal {
		//成员变量
		private String name;
		private int shoutNum;
		public String getName() {
			return name;
		}

		public int getShoutNum() {
			return shoutNum;
		}

		public void setShoutNum(int shoutNum) {
			this.shoutNum = shoutNum;
		}
		
		public Animal(){
			this.name="动物";//左侧的name 与name不是一个变量。
			this.shoutNum=3;
		}
		
		public Animal(String name){
			this.name=name;//左侧的name 与name不是一个变量。
			this.shoutNum=3;
		}
		
		//non static方法属于实体对象 Test1类的对象比如t1
		public void shout(){
			System.out.println("........");
		}
}
