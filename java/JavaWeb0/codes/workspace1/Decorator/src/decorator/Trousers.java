package decorator;
//Sunglass  Tshirt  Suit Hat Belt Dress 
public class Trousers extends ClothDecorator{

	public void show(){
		System.out.println("喇叭裤！");
		super.show();//先调用父类show方法！
		
	}
}
