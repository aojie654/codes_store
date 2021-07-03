package demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
//使用Scanner类。特别常用，一般使用Scanner获取键盘输入！
public class SystemTest {
	//使用scanner类，修改默认的系统输入和输出！进行copy！
	public static void main(String[] args) {
		Scanner scanner =null;
		try {
			//修改system.in 修改到普通文档中。
			//InputStream input = System.in;
			System.setIn(new FileInputStream("poem.txt"));
			//System.setIn(input);
			scanner = new Scanner(System.in);//scanner对象可以从控制台取得的数据！
			String line=null;
			//修改默认的输出！将sysout输出到console.txt文档中！
			System.setOut(new PrintStream(new FileOutputStream("console.txt")));
			while(scanner.hasNextLine()){ 
				line =scanner.nextLine();
				System.out.println(line);//将line打印倒文档中！
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			scanner.close();//在关闭后打开的流。
		}
	}
}
