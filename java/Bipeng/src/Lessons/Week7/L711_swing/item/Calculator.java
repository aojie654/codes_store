package Lessons.Week7.L711_swing.item;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Calculator extends JFrame {
	private JTextField txtResult;
    private double result = 0;
	private String lastCommand = "=";
	private boolean start = true;

	private Calculator() {
		super("Calculator By aojie654");
		txtResult = new JTextField(20);
		txtResult.setFocusable(false);
		this.add(txtResult, BorderLayout.NORTH);
        JPanel p = new JPanel(new GridLayout(4, 4));
		ButtonAction ba = new ButtonAction();
		KeyAction ka = new KeyAction();
        String[] name = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2",
                "3", "*", "0", ".", "=", "/"};
        JButton[] button = new JButton[name.length];
        for (int i = 0; i < button.length; i++) {
			button[i] = new JButton(name[i]);
			button[i].addActionListener(ba);
			button[i].addKeyListener(ka);
			p.add(button[i]);
		}

		this.add(p, BorderLayout.CENTER);
		this.setSize(400, 400);
		this.setLocation(400, 200);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void calculate(double x) {
        switch (lastCommand) {
            case "+":
                result += x;
                break;
            case "-":
                result -= x;
                break;
            case "*":
                result *= x;
                break;
            case "/":
                result /= x;
                break;
            case "=":
                result = x;
                break;
        }
		txtResult.setText("" + result);
	}

	private class ButtonAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String input = e.getActionCommand();

			if (input.equals("+") || input.equals("-") || input.equals("*")
					|| input.equals("/") || input.equals("=")) {
				if (start) {
					if (input.equals("-")) {
						txtResult.setText(input);
						start = false;
					} else
						lastCommand = input;
				} else {
					calculate(Double.parseDouble(txtResult.getText()));
					lastCommand = input;
					start = true;
				}
			} else {
				if (start) {
					txtResult.setText("");
					start = false;
				}
				txtResult.setText(txtResult.getText() + input);
			}
		}
	}

	private class KeyAction extends KeyAdapter {
		public void keyTyped(KeyEvent e) {
			char key = e.getKeyChar();
			if (key == '0' || key == '1' || key == '2' || key == '3' || key == '4' || key == '5' || key == '6' || key == '7' || key == '8' || key == '9') {
				if (start) {
					txtResult.setText("");
					start = false;
				}
				txtResult.setText(txtResult.getText() + key);
			}
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
		new Calculator();
	}
}
