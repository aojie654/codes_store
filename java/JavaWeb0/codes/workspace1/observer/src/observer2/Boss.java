package observer2;

public class Boss extends Subject{

	public void change(String newState){
		this.setState(newState);
		System.out.println("新状态是"+newState);
		this.nodify(newState);//自己的状态改变了，通知别注册的其他同事
	}
}
