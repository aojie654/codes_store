package version2;
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
	//定义update为抽象方法！
	public abstract void update(String newState);
}
