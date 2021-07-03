package item;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class RadioCheckDemo  extends JFrame {
	private JPanel p1, p2;
	private JLabel lblSex, lblLike;
	private JRadioButton rbMale, rbFemale;
	private ButtonGroup bg;
	private JCheckBox ckbRead, ckbNet, ckbSwim, ckbTour;
	public RadioCheckDemo() {
		super("单选和复选");
		this.setLayout(new GridLayout(2, 1));
		
		p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p2=new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		lblSex = new JLabel("性别:");
		lblLike = new JLabel("爱好:");
		// 创建单选按钮
		rbMale = new JRadioButton("男", true);
		rbFemale = new JRadioButton("女");
		// 创建按钮组
		bg = new ButtonGroup();
		// 将rb1和rb2两个单选按钮添加到按钮组中,这两个单选按钮只能选中其一
		bg.add(rbMale);
		bg.add(rbFemale);
		// 创建复选框
		ckbRead = new JCheckBox("阅读");
		ckbNet = new JCheckBox("上网");
		ckbSwim = new JCheckBox("游泳");
		ckbTour = new JCheckBox("旅游");
	
		// 性别相关的组件添加到p1子面板中
		p1.add(lblSex);
		p1.add(rbMale);
		p1.add(rbFemale);
		this.add(p1);
		
		// 爱好相关的组件添加到p2子面板中
		p2.add(lblLike);
		p2.add(ckbRead);
		p2.add(ckbNet);
		p2.add(ckbSwim);
		p2.add(ckbTour);
		this.add(p2);		
		
		// 设定窗口大小
		this.setSize(300, 100);
		// 设定窗口左上角坐标
		this.setLocation(200, 100);
		// 设定窗口默认关闭方式为退出应用程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口可视（显示）
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new RadioCheckDemo();
	}
}
