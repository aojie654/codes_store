package version2;

public class PhoneStudent extends Observer{

	public PhoneStudent(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	//根据状态改变观察者的行为！
	public void update(String newState){
		if(newState.equals("老师不在")){
			System.out.println("老师不在，"
		+this.getName()+"开始玩手机！");
		}
		if(newState.equals("老师在")){
			System.out.println("老师在，"
		+this.getName()+"好好学习！");
		}
	}
}
