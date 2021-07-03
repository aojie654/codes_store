package demo5;

public class RoboCat extends Cat implements ISon{

	public RoboCat (){
		super("机器猫");
	}
	
	@Override
	public void changeThing() {
	
		// TODO Auto-generated method stub
		System.out.println("我有空间口袋，可以变出各种东西！"+IChange.name);
	}

}
