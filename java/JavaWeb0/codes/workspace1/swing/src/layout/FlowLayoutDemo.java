package layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutDemo extends JFrame {
	// 声明组件
	private JPanel p;
	private JButton btn1, btn2, btn3;

	public FlowLayoutDemo() {
		super("FlowLayout流布局");
//		// 创建面板
//		p = new JPanel();
//		// 创建一个流布局对象，对齐方式是左对齐，水平间距10像素，垂直间距15像素
//		FlowLayout layout = new FlowLayout(FlowLayout.LEFT, 10, 15);
//		// 设置面板的布局
//		p.setLayout(layout);

		// 上面三行代码可以简化成下面一条语句
		 p=new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 15));

		//创建按钮 
		btn1 = new JButton("按钮 1");
		btn2 = new JButton("按钮 2");
		btn3 = new JButton("按钮 3");

		//将按钮添加到面板中
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);

		// 将面板添加到窗体中
		this.add(p);

		// 设定窗口大小
		this.setSize(200, 200);
		// 设定窗口左上角坐标
		this.setLocation(200, 100);
		// 设定窗口默认关闭方式为退出应用程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口可视（显示）
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutDemo();
	}
}
