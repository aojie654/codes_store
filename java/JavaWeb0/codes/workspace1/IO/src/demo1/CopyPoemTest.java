package demo1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
//处理文本还是要用Reader Writer！
public class CopyPoemTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader=null;//输入流的使用！
		Writer writer =null;//输出流
		//让输入流指向一个文件！
		//对程序来说input。也就是从文件读取数据！
		try {//"d://poem.txt"绝对路径 "src/demo1/InputStreamTest.java"相对路径！
			reader = new FileReader("poem.txt");
			//初始化writer
			writer = new FileWriter("poem2.txt");
			int readNum;//从文件中读了多少字符！
			//水壶用来舀水！从文件poem中舀水。（水就是数据）
			char[] bottle = new char[100];//水壶大小1024字符！
			//输入流读取数据。read方法。
			while((readNum=reader.read(bottle))>0){//抛出IO异常。非运行时异常所以要处理
				//readNum>0说明还有数据！1024+481字节！
				System.out.println("readNum:"+readNum);
				System.out.println(new String(bottle,0,readNum));
				writer.write(new String(bottle,0,readNum));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//无论如何都要关闭水龙头！
			try {
				reader.close();//关闭输入流！
				writer.close();//关闭输出流！
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
