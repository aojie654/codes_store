package basic;

public class Duck extends Bird{
	public Duck(){
		System.out.println("是一只鸭子！");
	}
	@Override
	public void layEggs() {
		this.breed();
		// TODO Auto-generated method stub
		System.out.println("鸭子下蛋，嘎嘎嘎！");
	}
}
