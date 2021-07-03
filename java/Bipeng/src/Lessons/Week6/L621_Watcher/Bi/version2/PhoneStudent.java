package Lessons.Week6.L621_Watcher.Bi.version2;

public class PhoneStudent extends Observer{
	public PhoneStudent(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(String newState){
		if(newState.equals("tf")){
			System.out.println("老师不在，"
					+this.getName()+"开始玩手机！");
		}
		if(newState.equals("tt")){
			System.out.println("老师在，"
					+this.getName()+"好好学习！");
		}
	}
}
