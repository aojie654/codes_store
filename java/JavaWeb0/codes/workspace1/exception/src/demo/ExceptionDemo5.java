package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo5 {

	public static void main(String[] args){
		
		//常见的异常！ 同时使用多个catch捕获异常。
		try{
		//1类型转换异常！
			int num = Integer.parseInt("abc");
		//2空指针异常！
			String s = null;
			s.charAt(0);
		//3类无法加载异常！ 非运行时异常！
			Class.forName("java.lang.Object");
		//4文件找不到异常   非运行时异常！
			FileReader f = new FileReader("a");
		//5算术异常！
			int a=0,b=1,c=0;
			c=b/a;
		//6数组越界异常！
			String[] strs = new String[3];
			strs[3]="abc";
		}catch(NumberFormatException |NullPointerException e){
			System.out.println("数字转换异常！或 空指针 异常！"); 
		}catch(ClassNotFoundException e){
			System.out.println("类无法找到异常！");	
		}catch(FileNotFoundException e){
			System.out.println("文件没有找到异常！");
		}catch(ArithmeticException e){
			System.out.println("算术异常！");
		}catch(Exception e){//能够捕获所有异常！Exception的子类 
			//越大的异常类越往后放！ 越具体的异常类越往前放！
			System.out.println("捕获其他种类运行时异常！");
			System.out.println(e.toString());
		}
		
		System.out.println("主函数继续！");
	}
}
