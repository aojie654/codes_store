package item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JButtonDemo extends JFrame {
	// 声明组件
	private JPanel p;
	private JButton btnTxt, btnImg;
	private int num = 0;

	public JButtonDemo() {
		super("JButton类");

		// 实例化面板对象p（默认为流布局）
		p = new JPanel();

		// 实例化一个按钮对象，该按钮上显示文字
		btnTxt = new JButton("您点击了0次按钮！");
		// 实例化一个按钮对象，该按钮上显示图标
		btnImg = new JButton(new ImageIcon("images\\configure.png"));

		// 注册监听
		btnTxt.addActionListener(new ActionListener() {
			// 行为事件处理方法
			public void actionPerformed(ActionEvent e) {
				// 统计点击按钮的此书
				num++;
				// 改变按钮的文本
				btnTxt.setText("您点击了" + num + "次按钮！");
			}
		});
		btnImg.addMouseListener(new MouseAdapter() {
			// 鼠标按下事件处理，按下左右键加载不同的图片
			public void mousePressed(MouseEvent e) {
				// 获取鼠标按键，判断是否是左键
				if (e.getButton() == MouseEvent.BUTTON1) {
					// 改变按钮的Icon
					btnImg.setIcon(new ImageIcon("images\\download.png"));
				}
				// 获取鼠标按键，判断是否是右键
				if (e.getButton() == MouseEvent.BUTTON3) {
					// 改变按钮的Icon
					btnImg.setIcon(new ImageIcon("images\\configure.png"));
				}
			}
		});

		// 将按钮添加到面板中
		p.add(btnTxt);
		p.add(btnImg);

		// 将面板添加到窗体中
		this.add(p);

		// 设定窗口大小
		this.setSize(600, 640);
		// 设定窗口左上角坐标
		this.setLocation(200, 100);
		// 设定窗口默认关闭方式为退出应用程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口可视（显示）
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new JButtonDemo();
	}
}
