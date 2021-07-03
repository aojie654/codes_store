package Lessons.Week4.L411_Buffer.java_3_27;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
//作业，将poem.txt中的诗copy到poem2.txt中！
public class WriterTest {

	public static void main(String[] args) {
		Writer writer =null;
		//输出流，输出到writePoe0.0
		// m.txt
		try {//如果没有wirtePoem.txt，系统则自动生成一个！
			writer = new FileWriter("./src/java_3_27/writePoemBi.txt");
			
			writer.write("为你写一首诗\n");
			writer.write("一首简单的诗\n");
			writer.write("java学习要努力\n");
			writer.write("每天一个小程序\n");
			writer.write("月薪过万不是梦！\n");
			writer.write("看你努力不努力！\n");
			writer.flush();//冲一下！把数据写入文档！
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				writer.close();//关闭时进行数据缓冲区刷新工作！
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
