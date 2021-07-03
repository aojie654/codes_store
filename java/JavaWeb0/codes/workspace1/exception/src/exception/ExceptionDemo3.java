package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo3 {

	//1了解复习常用异常
	//2学习多个catch块的使用。
	public static void main(String[] args){
		try{//jre 1.7
			//1 算术异常 运行时异常！
			int a=0,b=1,c=0;
			//c=b/a;
			//2 类型转换异常。
			int num = Integer.parseInt("abc");
		}catch(NumberFormatException |ArithmeticException e){
			System.out.println("捕获了算術異常或者数字转换异常！");
			boolean result=e instanceof ArithmeticException;
			if(result){
				System.out.println(e+"是一個算術異常！");
			}else{
				System.out.println(e+"是一個數字轉換異常！");
			}
		}
		try{
			//3 空指针异常！
			String str= null;
			str.charAt(0);
			//4 数组越界异常。
			String[] strs =new String[3];
			//strs[3]="abc";
			//5 类加载异常。
			Class.forName("java.lang.Object");
			//6 文件找不到异常 
			FileReader f = new FileReader("a");
		}catch(ClassNotFoundException e){
			System.out.println("捕获了类未加载异常！");
		}catch(FileNotFoundException e){
			System.out.println("捕获了文件未找到异常！");
		}catch(NullPointerException e){
			System.out.println("捕获了空指针异常！");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("捕获了数组越界异常！");
		}catch(RuntimeException e){//Exception 的子类包括了运行时异常和非运行时异常。都会被捕获！
			System.out.println("超级大网，捕获所有其他异常！");
		}//越大的网越往后放。越小的网（异常类型）往前放。
		
		System.out.println("主函数继续运行！");
	}
}
