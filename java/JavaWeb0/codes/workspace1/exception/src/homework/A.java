package homework;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class A {
	//定义A类，有两个方法。menthoda，menthodb。a中抛出运行时异常，b中抛出非运行时异常。
	public void methodA()throws ArithmeticException{
		try{
		int a=0,b=1;
		int c=b/a;
		}catch(ArithmeticException e){
			System.out.println("methoda 发生了异常！");
			throw e;
		}
	}
	
	public void methodB() throws FileNotFoundException {
		
		
		try {
			FileReader f = new FileReader("a");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("mehtodb抛出了非运行时异常！");
			//e.printStackTrace();
			throw e;
		}
	}

}
