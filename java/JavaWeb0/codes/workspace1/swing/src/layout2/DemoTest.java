package layout2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class DemoTest {
	//窗口
	private JFrame frame;
	//panle面板
	private JPanel p1;
	//构造函数中构造窗口！
	public DemoTest(){
		//学习如何初始化一个窗口！
		//1构造函数
		frame = new JFrame("我的小窗口");
		//2 设置大小
		frame.setSize(500,400);//两种方式都可以。宽300，长400
        //窗口显示的初始位置
		frame.setLocation(200, 100);//x,y 
		//使用默认退出行为
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//-----------------------------------------------------frame
		
		//初始化panel 默认布局流式Flow
		p1 = new JPanel();//此是显示的写出来了！
		Border emptyBorder =BorderFactory.createEmptyBorder(10, 10, 10, 10);
		Border llineBorder = BorderFactory.createLineBorder(Color.red);  
		Border etchedBorder = BorderFactory.createEtchedBorder();  
		Border raisedBorder = BorderFactory.createRaisedBevelBorder(); 
		
		p1.setBorder(emptyBorder);
		
		p1.setLayout(new GridLayout(2,2,20,20));
		//p2面板放中间
		JPanel p2 =new JPanel(new GridLayout(2,3,10,10));//p2使用Grid布局
		p2.add(new JButton("米"));
		p2.add(new JButton("面"));
		p2.add(new JButton("油"));
		p2.add(new JButton("肉"));
		p2.add(new JButton("蛋"));
		p2.add(new JButton("奶"));
		p1.add(p2);
		
		//p3面板放上面
		JPanel p3 =new JPanel();//默认就是Flow布局
		p3.add(new JLabel("bipeng"));
		p3.add(new JTextField(25));
		p3.add(new JLabel("java"));
		p1.add(p3);
		
		JPanel p4 =new JPanel();
		JLabel name =new JLabel("bipeng");
		JTextField text = new JTextField(30);
		JButton send =new JButton("发送");
		p4.add(name);
		p4.add(text);
		p4.add(send);
		p1.add(p4);
		
		//p5面板放下方。
		JPanel p5 =new JPanel();
		p5.setLayout(null);
		JButton b1 =new JButton("bipeng");
		// 调用setBounds()设置按钮的坐标和大小
		b1.setBounds(20, 20, 100, 25);
		p5.add(b1);
		p1.add(p5);
		frame.add(p1);
		
		//如果使用borderlayout布局。那么null布局只能用在center中。其他位置不适用。
		
		//------------------------------------------------------显示窗口
		frame.setVisible(true);			
		
	}
	public static void main(String[] args){
		new DemoTest();//显示窗口
	}
}
