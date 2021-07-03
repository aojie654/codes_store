package container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelTest {

	private JFrame frame;//窗口
	private JPanel panel;//面板必须被包含！中间容器。可以放置各种组件！
	
	public PanelTest(){
		frame = new JFrame("小窗口");
		frame.setSize(500, 300);//窗口设置大小！宽500，高300
		frame.setLocation(200, 100);// 坐标轴x ,y 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//默认店关闭后退出窗口
		//初始化ui好了以后。最后别忘了展示！
		
		//向frame中放置panel
		panel = new JPanel();

		//向面板中放置组件！按钮
		panel.add(new JButton("按钮1"));
		panel.add(new JButton("按钮2"));
		panel.add(new JButton("按钮3"));
		
		for(int i=0;i<=100;i++){
			panel.add(new JButton("button"+i));
		}
		
		//把面板放到frame中
		frame.add(panel);
		
		//展示窗口！
		frame.setVisible(true);//让窗口可见！
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PanelTest();
	}

}
