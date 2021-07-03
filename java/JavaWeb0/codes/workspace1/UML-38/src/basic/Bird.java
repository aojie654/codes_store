package basic;
public abstract class Bird extends Animal{
	//成员变量
	public String feather="羽毛";
	public String beak="喙";
	private Wing wing1;//翅膀1
	private Wing wing2;//翅膀2
	public Bird(){
		super();//默认系统调用父类的构造函数！无参。
		wing1= new Wing();//在构造函数中生成翅膀！
		wing2= new Wing();
	}
	//下蛋方法是抽象方法。
	public abstract void layEggs();
}
