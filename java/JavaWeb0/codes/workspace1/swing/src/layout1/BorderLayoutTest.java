package layout1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import container.PanelTest;

public class BorderLayoutTest {

	private JFrame frame;//窗口
	private JPanel panel;//面板必须被包含！中间容器。可以放置各种组件！
	
	public BorderLayoutTest(){
		frame = new JFrame("boderlayout窗口");
		frame.setSize(500, 300);//窗口设置大小！宽500，高300
		frame.setLocation(200, 100);// 坐标轴x ,y 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//默认店关闭后退出窗口
		//初始化ui好了以后。最后别忘了展示！
		
		//向frame中放置panel panel可以放到其他容器中。不见得一定是Frame。
		panel = new JPanel();
		//布局
		BorderLayout blayout = new BorderLayout();
		panel.setLayout(blayout);//设置布局管理器！
		
		JPanel jp1 = new JPanel();
		jp1.add(new JButton("按钮6"));
		jp1.add(new JButton("按钮7"));
		jp1.add(new JButton("按钮8"));
		jp1.add(new JButton("按钮9"));
		jp1.add(new JButton("按钮10"));
		jp1.add(new JButton("按钮11"));
		jp1.add(new JButton("按钮12"));
		
		//向面板中放置组件！按钮
		
		panel.add(new JButton("按钮1"),BorderLayout.NORTH);
		panel.add(new JButton("按钮2"),BorderLayout.EAST);
		panel.add(new JButton("按钮3"),BorderLayout.WEST);
		panel.add(jp1,BorderLayout.CENTER);
		panel.add(new JButton("按钮5"),BorderLayout.SOUTH);
		 
		//把面板放到frame中
		frame.add(panel);
		
		//展示窗口！
		frame.setVisible(true);//让窗口可见！
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutTest();
	}


}
