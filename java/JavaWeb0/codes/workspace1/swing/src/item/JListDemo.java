package item;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

public class JListDemo extends JFrame {
	private JPanel p;
	private JList listLeft, listRight;
	private JButton btnOk, btnCancel;
	DefaultListModel model;

	public JListDemo() {
		super("JList列表");
		this.setLayout(new GridLayout(1, 3));
		// 创建组件
		p = new JPanel(new GridLayout(2, 1));

		// 创建列表，并使用一个字符串数组初始化其选项列表
		listLeft = new JList(
				new String[] { "看书", "写字", "画画", "爬山", "跑步", "游泳" });
		// 设置列表的选择模式为单选
		listLeft.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// 创建一个空的列表
		listRight = new JList();
		// 定义一个默认的列表值模型
		model = new DefaultListModel();
		// 设置列表的值模型
		listRight.setModel(model);

		btnOk = new JButton("——>");
		btnCancel = new JButton("<——");

		// 注册监听
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 获取用户在左侧列表中选中的选项
				String strSelect = listLeft.getSelectedValue().toString();
				// 添加到右侧
				model.addElement(strSelect);
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 移除用户在右侧列表选中的选项
				model.remove(listRight.getSelectedIndex());
			}
		});

		// 将组件添加到容器中
		p.add(btnOk);
		p.add(btnCancel);
		this.add(listLeft);
		this.add(p);
		this.add(listRight);
		
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
		new JListDemo();
	}
}
