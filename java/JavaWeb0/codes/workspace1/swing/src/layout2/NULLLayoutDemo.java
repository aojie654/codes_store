package layout2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NULLLayoutDemo extends JFrame {
	private JPanel p;
	// 声明两个按钮对象
	private JButton btnOk, btnCancel;

	public NULLLayoutDemo() {
		super("NULL空布局");

		p = new JPanel();
		// 设置面板布局为空布局！
		p.setLayout(null);

		// 创建按钮
		btnOk = new JButton("确定");
		btnCancel = new JButton("取消");

		// 调用setBounds()设置按钮的坐标和大小
		btnOk.setBounds(30, 60, 60, 65);

		// 调用setLocation()设置按钮的坐标
		btnCancel.setLocation(100, 60);
		// 调用setSize()设置按钮的大小
		btnCancel.setSize(60, 25);

		// 将按钮添加到面板中
		p.add(btnOk);
		p.add(btnCancel);

		// 将面板添加到窗体中
		this.add(p);

		// 设定窗口大小
		this.setSize(300, 300);
		// 设定窗口左上角坐标
		this.setLocation(200, 100);
		// 设定窗口默认关闭方式为退出应用程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口可视（显示）
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new NULLLayoutDemo();
	}
}
