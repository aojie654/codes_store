package demo1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class BufferedTest {
	//使用InputStream实现对图片的拷贝！其他类型文件都可以！
	public static void main(String[] args) {
		// 带缓冲的输入流
		BufferedInputStream buffer = null;
		//与BufferedOutputStream比较，多了println方法。且容易实现格式化输出
		PrintStream  ps=null;
		try {//处理流需要包装节点流！使用带缓冲去的输入流，减少了io操作！
			buffer = new BufferedInputStream(new FileInputStream("123.jpg"));
			//ps 处理流包装了节点流。
			ps = new PrintStream(new FileOutputStream("copy123.jpg"));
			byte[] bottle = new byte[1024];//每次copy1024字节！
			int readNum=0;
			while((readNum=buffer.read(bottle))>0){
				//使用print方法，也可以选择write方法。
				ps.write(bottle, 0, readNum);
				ps.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				buffer.close();
				ps.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
