package item;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class JLabelDemo extends JFrame {
	// 声明组件
	private JPanel p;
	private JLabel lblTxt, lblImg, lblTxtImg;

	public JLabelDemo() {
		super("JLabel类");

		// 实例化面板对象p，面板布局是网格布局（3行1列）
		p = new JPanel(new GridLayout(3, 1));

		// 实例化一个标签对象，显示文字
		lblTxt = new JLabel("这是一个文本标签");
		// 实例化一个标签对象，显示图标
		lblImg = new JLabel(new ImageIcon("images\\logo.png"));
		// 实例化一个标签对象，显示文本和标签
		lblTxtImg = new JLabel("商标", new ImageIcon("images\\logo.png"),
				SwingConstants.CENTER);

		// 将按钮添加到面板中
		p.add(lblTxt);
		p.add(lblImg);
		p.add(lblTxtImg);

		// 将面板添加到窗体中
		this.add(p);

		// 设定窗口大小
		this.setSize(400, 300);
		// 设定窗口左上角坐标
		this.setLocation(200, 100);
		// 设定窗口默认关闭方式为退出应用程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口可视（显示）
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new JLabelDemo();
	}
}