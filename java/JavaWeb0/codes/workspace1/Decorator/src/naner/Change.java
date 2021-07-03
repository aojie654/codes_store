package naner;
//装饰类！
public class Change implements TheGreatestSage {
	private TheGreatestSage ttl;
	public void decorate(TheGreatestSage ttl) {
		this.ttl = ttl;
	}
	@Override
	public void move() {
		if(ttl!=null){//如果有自己的组件，则调用组件的move方法！
			ttl.move();//调用ttl的move方法！
		}
	}
}
