package layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutDemo extends JFrame {
	private JPanel p;
	private JButton btn1, btn2, btn3, btn4, btn5;

	public BorderLayoutDemo() {
		super("BorderLayout边界布局");
		p = new JPanel();

		// 创建一个边界布局管理器对象，并将该布局设置到面板中
		p.setLayout(new BorderLayout());
		
		//创建按钮
		btn1 = new JButton("按钮 1");
		btn2 = new JButton("按钮 2");
		btn3 = new JButton("按钮 3");
		btn4 = new JButton("按钮 4");
		btn5 = new JButton("按钮 5");

		// 将按钮放置到面板中指定位置
		p.add(btn1, BorderLayout.EAST);
		p.add(btn2, BorderLayout.WEST);
		p.add(btn3, BorderLayout.SOUTH);
		p.add(btn4, BorderLayout.NORTH);
		p.add(btn5, BorderLayout.CENTER);

		// 将面板添加到窗体中
		this.add(p);

		// 设定窗口大小
		this.setSize(300, 200);
		// 设定窗口左上角坐标
		this.setLocation(200, 100);
		// 设定窗口默认关闭方式为退出应用程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口可视（显示）
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutDemo();
	}
}
