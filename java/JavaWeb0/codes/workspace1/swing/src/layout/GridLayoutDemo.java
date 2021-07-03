package layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutDemo extends JFrame {
	private JPanel p;
	// 声明按钮数组
	private JButton[] btns;

	public GridLayoutDemo() {
		super("网格布局");

		// 创建一个2行3列的网格布局管理器对象，并将该布局设置到面板中
		p = new JPanel(new GridLayout(2, 3));

		// 实例化按钮数组的长度
		btns = new JButton[6];
		// 循环实例化数组中的每个按钮对象
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton("按钮 " + (i + 1));
		}

		// 循环将数组中的按钮添加到面板中
		for (int i = 0; i < btns.length; i++) {
			p.add(btns[i]);
		}

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
		new GridLayoutDemo();
	}
}
