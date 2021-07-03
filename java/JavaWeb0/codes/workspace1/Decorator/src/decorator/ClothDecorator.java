package decorator;

public class ClothDecorator implements Show{
	//聚合show对象
	private Show component;
	//通过装饰方法对component进行初始化！
	public void decorate(Show show){//调用此方法则会拥有自己的component！
		this.component = show;
	}
	@Override
	public void show() {
		if(component!=null){//如果有自己的组件，则调用组件的show方法！
			component.show();//调用component的show方法！
		}
	}
}
