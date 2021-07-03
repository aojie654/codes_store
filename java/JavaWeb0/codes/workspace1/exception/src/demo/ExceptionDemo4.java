package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("a不存在，所以不能找到！");
			FileReader f =new FileReader("a");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("e异常对象被捕获了！打印信息");
			e.printStackTrace();
		}
		System.out.println("程序继续运行！");
	}

}
