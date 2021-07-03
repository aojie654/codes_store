package layout2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutTest {
	//窗口
	private JFrame frame;
	//panle面板
	private JPanel panel;
	//构造函数中构造窗口！
	public FlowLayoutTest(){
		//学习如何初始化一个窗口！
		//1构造函数
		frame = new JFrame("我的小窗口");
		//2 设置大小
		frame.setSize(300,400);//两种方式都可以。宽300，长400
        //窗口显示的初始位置
		frame.setLocation(200, 100);//x,y 
		//使用默认退出行为
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//-----------------------------------------------------frame
		//初始化panel 默认布局流式Flow
		panel = new JPanel(new FlowLayout(FlowLayout.LEFT,20,20));//此是显示的写出来了！
		panel.add(new JButton("肉"));
		panel.add(new JButton("菜"));
		panel.add(new JButton("米"));
		
		for(int i=0;i<=50;i++){
			panel.add(new JButton("button"+i));
		}
		
		//将panel放到frame中
		frame.add(panel);

		
		//------------------------------------------------------显示窗口
		frame.setVisible(true);			
		
	}
	public static void main(String[] args){
		new FlowLayoutTest();//显示窗口
	}
	
}
