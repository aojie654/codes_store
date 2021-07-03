package item;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
//1 计算器改进 改一改。有点自己的特色计算器！利息。+ - GridBagLayout布局
//2 聊天室界面设计 
//3 记事本界面！使用Menu

public class Calculator2 extends JFrame {
	// 声明一个文本栏控件，用于显示计算结果
	private JTextField txtResult;
	private JPanel p;
	// 定义一个字符串数组，将计算器中按钮的文字都放在该数组中
	private String name[] = { "7", "8", "9", "+", "4", "5", "6", "-", "1", "2",
			"3", "*", "0", ".", "=", "/" ,"c","^","%","qrt"};
	// 声明一个按钮数组，该数组的长度以字符串数组的长度为准
	private JButton button[] = new JButton[name.length];
	// 定义一个存放计算结果的变量，初始为0
	private double result = 0;
	// 存放最后一个操作符，初始为“=”
	private String lastCommand = "=";
	// 标识是否是开始
	private boolean start = true;

	public Calculator2() {
		super("计算器");
		// 实例化文本栏控件
		txtResult = new JTextField(20);
		// 设置文本框不是焦点状态
		txtResult.setFocusable(false);
		// 将文本栏控件放置在窗体框架的上方（北部）
		this.add(txtResult, BorderLayout.NORTH);
		// 实例化面板对象，同时设置此面板布局为4行4列的网格布局
		p = new JPanel(new GridLayout(5, 4));
		// 循环实例化按钮对象数组
		// 实例化按钮监听对象
		ButtonAction ba = new ButtonAction();
		// 实例化键盘监听对象
		KeyAction ka = new KeyAction();
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton(name[i]);
			// 注册监听
			button[i].addActionListener(ba);
			button[i].addKeyListener(ka);
			p.add(button[i]);
		}

		this.add(p, BorderLayout.CENTER);
		// 设定窗口大小
		this.setSize(300, 300);
		// 设定窗口左上角坐标
		this.setLocation(200, 100);
		// 设定窗口默认关闭方式为退出应用程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口可视（显示）
		this.setVisible(true);
	}

	// 计算
	public void calculate(double x) {
		if (lastCommand.equals("+"))
			result += x;
		else if (lastCommand.equals("-"))
			result -= x;
		else if (lastCommand.equals("*"))
			result *= x;
		else if (lastCommand.equals("/"))
			result /= x;
		else if (lastCommand.equals("="))
			result = x;
		// 将结果显示在文本栏
		txtResult.setText("" + result);
	}

	// 点击按钮监听
	private class ButtonAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String input = e.getActionCommand();
			if(input.equals("c")){
				lastCommand ="=";
				result = 0;
				txtResult.setText("");
			}else{
				// 点击操作符号按钮
				if (input.equals("+") || input.equals("-") || input.equals("*")
						|| input.equals("/") || input.equals("=")) {
					if (start) {//如果为真 记录命令。不是=
						lastCommand = input;
					} else {//如果为假 进行计算， 记录命令，start为真
						calculate(Double.parseDouble(txtResult.getText()));
						lastCommand = input;
						start = true;
					}
				} else {//不是操作符按钮是数字按钮则
					if (start) {//如果为真 ，进行初始化，txt为空。start为假
						txtResult.setText("");
						start = false;
					}//菜单栏为输入内容+刚输入。
					txtResult.setText(txtResult.getText() + input);
				}
			}
		}
	}

	// 键盘监听
	private class KeyAction extends KeyAdapter {
		public void keyTyped(KeyEvent e) {
			char key = e.getKeyChar();
			// 敲击的键盘是数字
			if (key == '0' || key == '1' || key == '2' || key == '3'
					|| key == '4' || key == '5' || key == '6' || key == '7'
					|| key == '8' || key == '9' || key == '9') {
				if (start) {
					txtResult.setText("");
					start = false;
				}
				txtResult.setText(txtResult.getText() + key);
			}
			// 敲击的键盘是操作符号
			else if (key == '+' || key == '-' || key == '*' || key == '/'
					|| key == '=') {
				if (start) {
					if (key == '-') {
						txtResult.setText(String.valueOf(key));
						start = false;
					} else
						lastCommand = String.valueOf(key);
				} else {
					calculate(Double.parseDouble(txtResult.getText()));
					lastCommand = String.valueOf(key);
					start = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		new Calculator2();
	}
}
