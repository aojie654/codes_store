package version2;

import java.util.ArrayList;
import java.util.List;

//Subject负责对Observer通知更新
public abstract class Subject {
	private List<Observer> list = 
			new ArrayList<Observer>();
	public void attach(Observer stu){
		list.add(stu);
		System.out.println(stu.getName()+"和我关系不错，有事我要通知他");
	}
	public void dettach(Observer stu){
		list.remove(stu);
		System.out.println("不带"+stu.getName()+"玩了，有事也不告诉他");
	}
	
	private String state;//班长随时掌握状态！
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	//通知各位订阅的对象更新自己的行为！
	public void inform(String newState){
		for(Observer stu:list){
			stu.update(newState);
		}
	}
}
