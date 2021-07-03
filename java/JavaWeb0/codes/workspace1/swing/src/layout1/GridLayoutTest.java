package layout1;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import container.PanelTest;

public class GridLayoutTest {

	private JFrame frame;//窗口
	private JPanel panel;//面板必须被包含！中间容器。可以放置各种组件！
	private JButton btn1;
	public GridLayoutTest(){
		
		//初始化ui好了以后。最后别忘了展示！
		btn1 = new JButton("1");
		//向frame中放置panel panle必须放到别的容器中！它是中间容器，不能独立存在！
		panel = new JPanel();
		//网格布局
		GridLayout glayout = new GridLayout(3,3);//3行，2列
		panel.setLayout(glayout);//设置布局管理器！否则panel使用默认flow布局
		
		//向面板中放置组件！按钮 。
		panel.add(btn1);
		panel.add(new JButton("按钮2"));
		panel.add(new JButton("按钮3"));
		panel.add(new JButton("按钮4"));
		panel.add(new JButton("按钮5"));
		panel.add(new JButton("按钮6"));
		panel.add(new JButton("按钮7"));

		
		frame = new JFrame("boderlayout窗口");
		frame.setSize(500, 300);//窗口设置大小！宽500，高300
		frame.setLocation(200, 100);// 坐标轴x ,y 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//默认店关闭后退出窗口
		//把面板放到frame中
		frame.add(panel);
		
		//展示窗口！
		frame.setVisible(true);//让窗口可见！
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutTest();
	}


}
