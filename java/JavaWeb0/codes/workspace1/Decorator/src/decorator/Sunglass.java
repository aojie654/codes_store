package decorator;

public class Sunglass extends ClothDecorator{
	public void show(){
		//首先执行本类自己的component的show方法！
		System.out.println("酷炫的阿玛尼太阳镜！");
		super.show();//先调用父类自己的show方法！也就是执行本类自己的component的show方法！
		System.out.println("阿玛尼太阳镜最酷！");
	}
}
