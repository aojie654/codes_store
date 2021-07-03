package demo1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class BufferedCharTest {

	public static void main(String[] args) {
		// 带缓冲的输入流
		BufferedReader breader = null;
		//与BufferedOutputStream比较，多了println方法。且容易实现格式化输出
		PrintWriter  pw=null;
		try {//处理流需要包装节点流！使用带缓冲去的输入流，减少了io操作！
			breader = new BufferedReader(new FileReader("poem.txt"));
			//ps 处理流包装了节点流。
			pw = new PrintWriter(new FileWriter("poem2.txt"));
			/*char[] bottle = new char[1024];
			int readNum=0;
			while((readNum=breader.read(bottle))>0){
				System.out.println(new String(bottle,0,readNum));
				//使用print方法，也可以选择write方法。
				pw.print(new String(bottle,0,readNum));
			}*/
			//使用readLine简约写法！
			String line=null;
			while((line=breader.readLine())!=null){
				pw.println(line);//line不包含换行符！使用println方法！
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				breader.close();
				pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
