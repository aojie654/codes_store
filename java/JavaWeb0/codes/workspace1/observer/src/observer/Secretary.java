package observer;

import java.util.ArrayList;
import java.util.List;
//秘书类的主要工作是根据action情况，通知各位小朋友！
public class Secretary {
	//秘书得到消息！
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	//保存关系好的同事的List
	private List<Observer> list = new ArrayList<Observer>();
	//绑定关系好的同事
	public void attach(Observer o){
		list.add(o);
		System.out.println(o.getName()+"和我关系好，有事我要通知他！");
	}
	//通知每个人，新情况！
	public void nodify(){
		for(Observer o:list){
			o.update(this.state);
		}
	}
}
