package container;

import javax.swing.JFrame;

public class FrameTest {

	private JFrame frame;
	
	public FrameTest(){
		frame = new JFrame("小窗口");
		frame.setSize(500, 300);//窗口设置大小！宽500，高300
		frame.setLocation(200, 100);// 坐标轴x ,y 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//默认店关闭后退出窗口
		//初始化ui好了以后。最后别忘了展示！
		
		frame.setVisible(true);//让窗口可见！
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FrameTest();
	}

}
