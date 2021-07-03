package observer2;

//偷懒小职员！
public class NBAObserver extends Observer{
	public NBAObserver(String name) {
		super(name);
	}
	//方法根据通知改变状态！
	public void update(String action){
		if(action.equals("老板在")){
			System.out.println(this.getName()+"老板在！好好工作！");
		}
		if(action.equals("老板不在")){
			System.out.println(this.getName()+"老板不在！开始偷懒，看NBA！！");
		}
	}
	
	
}
