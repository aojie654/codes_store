package demo;

public class throwTest {
	//throws 声明方法可能抛出异常。后跟异常类型！可以有多个用逗号隔开
	public static void method(String[] ars) throws Exception{
		//throw 是个动词，一次只能抛出一个异常实例！
		//抛出一个异常球！
		//任何地方都可以throw抛出 异常球，只要你需要！
		//异常球从何而来？1 自己新建一个异常。
		//2 代码有问题，系统根据问题情况，创建异常！
		throw new Exception();	
	}
}
