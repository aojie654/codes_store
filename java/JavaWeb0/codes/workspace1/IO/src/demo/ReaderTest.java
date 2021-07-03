package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest {

	public static void main(String[] args) {
		//指向一个文件
		Reader input = null;
		try {//"src//demo//InputStreamTest.java"
			input = new FileReader("poem2.txt");//相对路径！绝对
			int readNum=0;//读的数据的数量！
			//Reader单位是char字符。读出来的是字符！
			char [] bottle = new char[100];//数据放到水壶里！
			//使用input流，从poem.txt中读数据！
			//尽可能多的读数据。将数据放到bottle中。
			//读了多少数据返回给readNum。这样就知道bottle有多少数据！
			while((readNum=input.read(bottle))>0){
			//要把缸中的水都摇出来。那就要一瓢一瓢不停的摇，知道摇完。
			System.out.println("readNum"+readNum);
			System.out.println(new String(bottle,0,readNum));
			}//poem2 文档有个483字符！
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				input.close();//关闭input输入流资源！
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
