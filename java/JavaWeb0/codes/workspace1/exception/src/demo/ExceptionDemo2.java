package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo2 {
	//抛给jvm进行后续处理！                                                       //声明抛出了此异常，但不一定要求你一定throw e
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try{
			System.out.println("a不存在，所以不能找到！");
			FileReader f =new FileReader("a");
		}catch(FileNotFoundException e){
			System.out.println("e被捕获了，进行处理！");
			e.printStackTrace();
			
			//throw e;
			//抛给调用的方法进行后续处理！
		}finally{
			System.out.println("无论是否抛出异常，finally都被执行了！");
		}
		System.out.println("程序继续运行！");
	}

}
