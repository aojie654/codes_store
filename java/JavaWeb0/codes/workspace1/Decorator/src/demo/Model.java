package demo;

public class Model implements Show{

	private String name;
	public Model(String name){
		this.name = name;
	}
	//装饰模式要对model的show方法进行装饰！
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(name+" ,穿着打扮好的模特！走在时尚最前沿！");
	}

}
