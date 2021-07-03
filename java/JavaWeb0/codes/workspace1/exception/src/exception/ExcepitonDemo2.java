package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExcepitonDemo2 {
	// 定义A类，有两个方法。menthoda，menthodb。a中抛出运行时异常，b中抛出非运行时异常。
	// 定义B类，在menthod函数中调用A类两个方法。分别进行异常捕获，处理并抛出异常。
	// 定义C类，在主函数中，调用B类的method方法。并处理异常。不抛出！

	//throws声明可以抛出多个异常，之间用逗号分隔！
	public static void method () throws FileNotFoundException,ClassCastException{
		try {
			FileReader f = new FileReader("a");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("文件a找不到！异常被method方法捕获，并抛出！");
			throw e;//扔出异常！
		}
	}
	public static void methodb () {
		try {
			method();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("捕获method跑出的异常！");
			//throw e;
		}
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		methodb();
		System.out.println("主函数继续go on！");
	}

}
