package decorator;
//我们要对show方法进行装饰！
public class Model implements Show{
	private String name;
	public Model(String name){
		this.name = name;
	}
	@Override
	public void show() {//此方法为已经有的类写好的方法！我们需要对此方法进行装饰！
		// TODO Auto-generated method stub
		System.out.println(name+ " ,模特在T台上走秀！非常时尚！");
	}
	
}
