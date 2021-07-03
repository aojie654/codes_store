package observer;

//偷懒小职员！
public class Observer {
	private  String name;
	public Observer(String name){
		this.name=name;
	}
	//方法根据通知改变状态！
	public void update(String action){
		if(action.equals("老板在")){
			System.out.println(this.name+"老板在！好好工作！");
		}
		if(action.equals("老板不在")){
			System.out.println(this.name+"老板不在！开始偷懒，看股票，玩游戏！！");
		}
	}
	public String getName() {
		return name;
	}
	
}
