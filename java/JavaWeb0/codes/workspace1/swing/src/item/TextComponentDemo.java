package item;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//文本组件
public class TextComponentDemo extends JFrame {
	// 声明组件
	private JPanel p;
	private JLabel lblName, lblPwd, lblRePwd, lblAddress, lblMsg;
	// 声明一个文本框
	private JTextField txtName;
	// 声明两个密码框
	private JPasswordField txtPwd, txtRePwd;
	// 声明一个文本域
	private JTextArea txtAddress;
	private JButton btnReg, btnCancel;

	public TextComponentDemo() {
		super("注册新用户");
		// 创建面板，面板的布局为NULL
		p = new JPanel(null);

		// 实例化5个标签
		lblName = new JLabel("用户名");
		lblPwd = new JLabel("密      码");
		lblRePwd = new JLabel("确认密码");
		lblAddress = new JLabel("地      址");
		// 显示信息的标签
		lblMsg = new JLabel();
		// 设置标签的文字颜色是红色
		lblMsg.setForeground(Color.red);

		// 创建一个长度为20的文本框
		txtName = new JTextField(20);

		// 创建两个密码框，长度20
		txtPwd = new JPasswordField(20);
		txtRePwd = new JPasswordField(20);
		// 设置密码框显示的字符为*
		txtPwd.setEchoChar('*');
		txtRePwd.setEchoChar('*');

		// 创建一个文本域
		txtAddress = new JTextArea(20, 2);

		// 创建两个按钮
		btnReg = new JButton("注册");
		btnCancel = new JButton("清空");

		// 注册确定按钮的事件处理
		btnReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 设置信息标签为空，清空原来历史信息
				lblMsg.setText("");
				// 获取用户输入的用户名
				String strName = txtName.getText();
				if (strName == null || strName.equals("")) {
					lblMsg.setText("用户名不能为空！");
					return;
				}
				// 获取用户输入的密码
				String strPwd = new String(txtPwd.getPassword());
				if (strPwd == null || strPwd.equals("")) {
					lblMsg.setText("密码不能为空！");
					return;
				}
				// 获取用户输入的确认密码
				String strRePwd = new String(txtRePwd.getPassword());
				if (strRePwd == null || strRePwd.equals("")) {
					lblMsg.setText("确认密码不能为空！");
					return;
				}
				// 判断确认密码是否跟密码相同
				if (!strRePwd.equals(strPwd)) {
					lblMsg.setText("确认密码与密码不同！");
					return;
				}
				// 获取用户输入的地址
				String strAddress = new String(txtAddress.getText());
				if (strAddress == null || strAddress.equals("")) {
					lblMsg.setText("地址不能为空！");
					return;
				}

				lblMsg.setText("注册成功！");
			}
		});

		// 取消按钮的事件处理
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 清空所有文本组件中的文本
				txtName.setText("");
				txtPwd.setText("");
				txtRePwd.setText("");
				txtAddress.setText("");
				// 设置信息标签为空
				lblMsg.setText("");
			}
		});

		// 定位所有组件
		lblName.setBounds(30, 30, 60, 25);
		txtName.setBounds(95, 30, 120, 25);
		lblPwd.setBounds(30, 60, 60, 25);
		txtPwd.setBounds(95, 60, 120, 25);
		lblRePwd.setBounds(30, 90, 60, 25);
		txtRePwd.setBounds(95, 90, 120, 25);
		lblAddress.setBounds(30, 120, 60, 25);
		txtAddress.setBounds(95, 120, 120, 50);
		lblMsg.setBounds(60, 185, 180, 25);
		btnReg.setBounds(60, 215, 60, 25);
		btnCancel.setBounds(125, 215, 60, 25);

		// 将组件添加到面中
		p.add(lblName);
		p.add(txtName);
		p.add(lblPwd);
		p.add(txtPwd);
		p.add(lblRePwd);
		p.add(txtRePwd);
		p.add(lblAddress);
		p.add(txtAddress);
		p.add(lblMsg);
		p.add(btnReg);
		p.add(btnCancel);

		// 将面板添加到窗体中
		this.add(p);

		// 设定窗口大小
		this.setSize(280, 300);
		// 设定窗口左上角坐标（X轴200像素，Y轴100像素）
		this.setLocation(200, 100);
		// 设定窗口默认关闭方式为退出应用程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口可视（显示）
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new TextComponentDemo();
	}
}
