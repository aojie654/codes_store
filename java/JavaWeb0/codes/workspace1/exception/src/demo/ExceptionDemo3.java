package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo3 {
	public static void methodA() throws FileNotFoundException{
		try {
			FileReader f = new FileReader("a");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("处理抛出的fileNotfound异常！");
			throw e;
		}
	}
	//对于运行时异常可以选择不处理！
	public static void methodB()throws ArithmeticException{
		try {
			methodA();//methodA有可能抛出非运行时异常，要求调用的方法必须处理！
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("处理methodA抛出的fileNotfound异常！");
			e.printStackTrace();
		}
	}
	public static void main(String[] args){
		//处理异常的方式2种，可以有多种变形的组合！由程序员定！
		methodB();//必须对methodB所可能抛出的非运行时异常进行处理！
		try {
			methodA();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("主函数处理methodA异常，不要再throw e了。否则异常抛给jvm，程序就停了！");
		}
		System.out.println("程序继续运行！");
	}
}
