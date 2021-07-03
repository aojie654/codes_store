package demo;
//Sunglass  Tshirt  Suit Hat Belt Dress 
public class Trousers extends ClothDecorator{

	public void show(){
		super.show();//先调用父类show方法！
		System.out.println("喇叭裤！");
	}
}
