package layout2;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardLayoutDemo extends JFrame {
	private JPanel p;
	// 声明按钮数组
	private JButton[] btns;
	// 声明卡片布局管理器
	private CardLayout cl;

	public CardLayoutDemo() {
		super("CardLayout卡片布局");
		// 实例化卡片布局管理器对象
		cl = new CardLayout();
		// 实例面板对象，其布局为卡片布局
		p = new JPanel(cl);
		
		// 实例化按钮数组的长度
		btns = new JButton[6];
		// 循环实例化数组中的每个按钮对象
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton("按钮 " + (i + 1));
		}

		// 循环将数组中的按钮添加到面板中
		for (int i = 0; i < btns.length; i++) {
			p.add("第" + (i + 1) + "张", btns[i]);
		}

		// 将面板添加到窗体中
		this.add(p);

		// 显示最后一张卡片
		cl.last(p);
		// 显示名称是"第3张"的卡片
	    cl.show(p, "第2张");

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
		new CardLayoutDemo();
	}
}
