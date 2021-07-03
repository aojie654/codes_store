package basic;

public class Goose extends Bird implements IFly{
	public Goose(){
		System.out.println("是一只大雁");
	}
	@Override
	public void layEggs() {
		// TODO Auto-generated method stub
		System.out.println("大雁下蛋，咯咯咯！");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("大雁在天上飞！");
	}

}
