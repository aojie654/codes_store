package homework1;

import java.io.FileNotFoundException;

public class B {
	// 定义B类，在menthod函数中调用A类两个方法。分别进行异常捕获，处理并抛出异常。
	public void method() throws ArithmeticException,FileNotFoundException{
		A a = new A();
		try {
			a.methodA();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("B类捕获了A的mehtodA方法的算术异常！");
			//throw e;
		}
		try {
			a.methodB();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("B类捕获了A的mehtodb方法的文件未找到异常！");
			throw e;
		}
		
	}
}
