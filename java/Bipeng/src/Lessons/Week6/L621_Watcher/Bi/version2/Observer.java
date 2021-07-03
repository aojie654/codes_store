package Lessons.Week6.L621_Watcher.Bi.version2;
//Student类就是观察者。
public abstract class Observer {
	private String name;
	public Observer(String name) {
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
	public abstract void update(String newState);
}
