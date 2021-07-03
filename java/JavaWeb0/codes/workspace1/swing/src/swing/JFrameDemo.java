package swing;

import javax.swing.JFrame;

public class JFrameDemo extends JFrame {
	public JFrameDemo() {
		// 调用父类构造方法，并指定窗口标题
		super("frame");
		// 设定窗口大小（宽度400像素，高度300像素）
		this.setSize(400, 300);
		// 设定窗口左上角坐标（X轴200像素，Y轴100像素）
		this.setLocation(200, 100);
		// 设定窗口默认关闭方式为退出应用程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口可视（显示）
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// 实例化一个JFrameDemo对象
		new JFrameDemo();
	}

}
