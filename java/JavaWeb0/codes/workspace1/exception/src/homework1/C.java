package homework1;

import java.io.FileNotFoundException;

public class C {
	// 定义C类，在主函数中，调用B类的method方法。并处理异常。不抛出！
	//主函数抛出了异常，异常抛给了JVM。JVM将异常信息打印！程序结束！
	public static void main(String[] args){
		B b = new B();
		
		try {
			b.method();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("主函数捕获了B类抛出的文件未找到异常！");
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("主函数捕获了B类抛出的算术异常！");
		}
		
		System.out.println("主函数继续运行！");
		
	}
}
