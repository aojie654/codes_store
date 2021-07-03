package observer2;

import java.util.ArrayList;
import java.util.List;
//秘书类的主要工作是根据action情况，通知各位小朋友！
public class Subject {
	//秘书得到消息！
	private String state;
	public String getState(){
		return state;
	}
	public String setState(String state){
		return this.state=state;
	}
	//保存关系好的同事的List
	private List<Observer> list = new ArrayList<Observer>();
	//绑定关系好的同事
	public void attach(Observer o){
		list.add(o);
		System.out.println(o.getName()+"增加一个要通知的同事");
	}
	//通知每个人，新情况！
	public void nodify(String newState){
		for(Observer o:list){
			o.update(newState);
		}
	}
}
