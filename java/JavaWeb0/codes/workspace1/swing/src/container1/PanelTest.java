package container1;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelTest {
	//窗口
	private JFrame frame;
	//panle面板
	private JPanel panel;
	//构造函数中构造窗口！
	public PanelTest(){
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
		//初始化panel
		panel = new JPanel();
		panel.add(new JButton("肉"));
		//panel.add(new JButton("菜"));
		//panel.add(new JButton("米"));
		//将panel放到frame中
		frame.add(panel);

		//------------------------------------------------------显示窗口
		frame.setVisible(true);			
		
	}
	public static void main(String[] args){
		new PanelTest();//显示窗口
	}
	
}
