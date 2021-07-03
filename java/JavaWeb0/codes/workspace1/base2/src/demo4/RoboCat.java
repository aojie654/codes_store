package demo4;

public class RoboCat extends Cat implements IChange{

	public RoboCat(String name){
		super(name);
	}
	@Override
	public void changeThing() {
		// TODO Auto-generated method stub
		System.out.println("变出花样！竹蜻蜓！");
	}

}
