package Lessons.Week7.L711_swing.item;

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

//�ı����
public class TextComponentDemo extends JFrame {
	// �������
	private JPanel p;
	private JLabel lblName, lblPwd, lblRePwd, lblAddress, lblMsg;
	// ����һ���ı���
	private JTextField txtName;
	// �������������
	private JPasswordField txtPwd, txtRePwd;
	// ����һ���ı���
	private JTextArea txtAddress;
	private JButton btnReg, btnCancel;

	public TextComponentDemo() {
		super("ע�����û�");
		// ������壬���Ĳ���ΪNULL
		p = new JPanel(null);

		// ʵ����5����ǩ
		lblName = new JLabel("�û���");
		lblPwd = new JLabel("��      ��");
		lblRePwd = new JLabel("ȷ������");
		lblAddress = new JLabel("��      ַ");
		// ��ʾ��Ϣ�ı�ǩ
		lblMsg = new JLabel();
		// ���ñ�ǩ��������ɫ�Ǻ�ɫ
		lblMsg.setForeground(Color.red);

		// ����һ������Ϊ20���ı���
		txtName = new JTextField(20);

		// ������������򣬳���20
		txtPwd = new JPasswordField(20);
		txtRePwd = new JPasswordField(20);
		// �����������ʾ���ַ�Ϊ*
		txtPwd.setEchoChar('*');
		txtRePwd.setEchoChar('*');

		// ����һ���ı���
		txtAddress = new JTextArea(20, 2);

		// ����������ť
		btnReg = new JButton("ע��");
		btnCancel = new JButton("���");

		// ע��ȷ����ť���¼�����
		btnReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ������Ϣ��ǩΪ�գ����ԭ����ʷ��Ϣ
				lblMsg.setText("");
				// ��ȡ�û�������û���
				String strName = txtName.getText();
				if (strName == null || strName.equals("")) {
					lblMsg.setText("�û�������Ϊ�գ�");
					return;
				}
				// ��ȡ�û����������
				String strPwd = new String(txtPwd.getPassword());
				if (strPwd == null || strPwd.equals("")) {
					lblMsg.setText("���벻��Ϊ�գ�");
					return;
				}
				// ��ȡ�û������ȷ������
				String strRePwd = new String(txtRePwd.getPassword());
				if (strRePwd == null || strRePwd.equals("")) {
					lblMsg.setText("ȷ�����벻��Ϊ�գ�");
					return;
				}
				// �ж�ȷ�������Ƿ��������ͬ
				if (!strRePwd.equals(strPwd)) {
					lblMsg.setText("ȷ�����������벻ͬ��");
					return;
				}
				// ��ȡ�û�����ĵ�ַ
				String strAddress = new String(txtAddress.getText());
				if (strAddress == null || strAddress.equals("")) {
					lblMsg.setText("��ַ����Ϊ�գ�");
					return;
				}

				lblMsg.setText("ע��ɹ���");
			}
		});

		// ȡ����ť���¼�����
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��������ı�����е��ı�
				txtName.setText("");
				txtPwd.setText("");
				txtRePwd.setText("");
				txtAddress.setText("");
				// ������Ϣ��ǩΪ��
				lblMsg.setText("");
			}
		});

		// ��λ�������
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

		// �������ӵ�����
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

		// �������ӵ�������
		this.add(p);

		// �趨���ڴ�С
		this.setSize(280, 300);
		// �趨�������Ͻ����꣨X��200���أ�Y��100���أ�
		this.setLocation(200, 100);
		// �趨����Ĭ�Ϲرշ�ʽΪ�˳�Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڿ��ӣ���ʾ��
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new TextComponentDemo();
	}
}
