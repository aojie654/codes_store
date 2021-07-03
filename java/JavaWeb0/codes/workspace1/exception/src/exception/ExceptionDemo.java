package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("hello! boys and girls");
		
		try{//试一试 把异常当做球，抛出去！
			System.out.println("lets play a game!");
			System.out.println("catch ball! go!");
			int a =0,b=1,c;
			//c=b/a;//抛出了一个异常球！
			//1 try catch 2 throws
			
			try {
				FileReader f = new FileReader("a");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//1 捕获异常，进行处理。完成部分处理后，抛出让别人处理！
				throw e;
			}	
				
			//新建一个文件！
			System.out.println("再来一球！");
			System.out.println("再来一球a ！");
			System.out.println("再来一球b ！");
			System.out.println("再来一球c ！");
			
		}catch(RuntimeException e){//可以接住所有运行时异常！接球！
			e.printStackTrace();//打印堆栈信息！
			//数学异常就是一个运行时异常！
			System.out.println("yes i got your ball！");
			
		}finally{//无论如何，不管有没有错，都要执行！
			System.out.println("lets play go on!");
		}
		
		System.out.println("今天玩的很开心，拜拜！");
		
	}

}
