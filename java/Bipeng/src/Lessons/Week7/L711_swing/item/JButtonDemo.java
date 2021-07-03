package Lessons.Week7.L711_swing.item;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JButtonDemo extends JFrame {
	// �������
	private JPanel p;
	private JButton btnTxt, btnImg;
	private int num = 0;

	public JButtonDemo() {
		super("JButton��");

		// ʵ����������p��Ĭ��Ϊ�����֣�
		p = new JPanel();

		// ʵ����һ����ť���󣬸ð�ť����ʾ����
		btnTxt = new JButton("�������0�ΰ�ť��");
		// ʵ����һ����ť���󣬸ð�ť����ʾͼ��
		btnImg = new JButton(new ImageIcon("images\\configure.png"));

		// ע�����
		btnTxt.addActionListener(new ActionListener() {
			// ��Ϊ�¼�������
			public void actionPerformed(ActionEvent e) {
				// ͳ�Ƶ����ť�Ĵ���
				num++;
				// �ı䰴ť���ı�
				btnTxt.setText("�������" + num + "�ΰ�ť��");
			}
		});
		btnImg.addMouseListener(new MouseAdapter() {
			// ��갴���¼������������Ҽ����ز�ͬ��ͼƬ
			public void mousePressed(MouseEvent e) {
				// ��ȡ��갴�����ж��Ƿ������
				if (e.getButton() == MouseEvent.BUTTON1) {
					// �ı䰴ť��Icon
					btnImg.setIcon(new ImageIcon("images\\download.png"));
				}
				// ��ȡ��갴�����ж��Ƿ����Ҽ�
				if (e.getButton() == MouseEvent.BUTTON3) {
					// �ı䰴ť��Icon
					btnImg.setIcon(new ImageIcon("images\\configure.png"));
				}
			}
		});

		// ����ť��ӵ������
		p.add(btnTxt);
		p.add(btnImg);

		// �������ӵ�������
		this.add(p);

		// �趨���ڴ�С
		this.setSize(600, 640);
		// �趨�������Ͻ�����
		this.setLocation(200, 100);
		// �趨����Ĭ�Ϲرշ�ʽΪ�˳�Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڿ��ӣ���ʾ��
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new JButtonDemo();
	}
}
