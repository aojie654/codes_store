package demo;
//
public class ClothDecorator implements Show{
	
	private Show component;
	
	public void decorate(Show component){
		this.component=component;
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		if(component!=null){
			component.show();//调用组件的show方法！
		}
	}

}
