package demo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest {

	public static void main(String[] args){
		Writer writer=null;
		//作业2 将poem2中的故事，写到write中。自动写！
		try {
			//如果文档不存在，则帮我们创建一个文件！
			writer = new FileWriter("write.txt");
			writer.write("十年生死两茫茫。不思量。自难忘。");
			writer.write("\n");//实现换行！
			writer.write("千里孤坟，无处话凄凉。");
			writer.write("\n");
			writer.write("纵使相逢应不识，尘满面，鬓如霜。");
			writer.write("\n");
			writer.write("夜来幽梦忽还乡。小轩窗。正梳妆。");
			writer.write("\n");
			writer.write("相顾无言，惟有泪千行。料得年年肠断处，明月夜，短松冈。 ");
			writer.write("\n");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				writer.close();//刷新缓冲区，把内容写入文档！
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
