package version1;
//Student类就是观察者。
public class Student {
	private String name;
	public Student(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//根据状态改变观察者的行为！
	public void update(String newState){
		if(newState.equals("老师不在")){
			System.out.println("老师不在，"
		+this.name+"开始玩手机！");
		}
		if(newState.equals("老师在")){
			System.out.println("老师在，"
		+this.name+"好好学习！");
		}
	}
}
