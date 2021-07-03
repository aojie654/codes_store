package basic;

public abstract class Bird extends Animal{
	public String feather="羽毛";
	public String beak="喙";
	//wing1 wing2是鸟的两个翅膀！
	public Wing wing1;
	public Wing wing2;
	//鸟的构造函数，长出自己的翅膀！
	public Bird(){
		super();//在构造函数中对翅膀进行初始化！而不是传递进来！
		wing1 = new Wing();
		wing2 = new Wing();
	}
	
	public abstract void layEggs();
	
	
}
