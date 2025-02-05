package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;

public class Cal {

	private JFrame frame;
	private JTextField textField;
	
	Double number1;
	Double number2;
	Double result;
	String answer;
	String operator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cal window = new Cal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBackground(new Color(0, 0, 0));
		frame.getContentPane().setForeground(new Color(128, 128, 128));
		frame.setBounds(100, 100, 473, 570);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(0, 0, 0));
		textField.setFont(new Font("Tahoma", Font.BOLD, 42));
		textField.setBounds(10, 11, 438, 141);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("AC");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(122, 177, 102, 60);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uF0E7");
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
					
				}
			}
		});
		btnNewButton_1.setBounds(10, 177, 102, 60);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("%");
		btnNewButton_2.setBackground(Color.GRAY);
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(234, 177, 102, 60);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "%";
			}
		});
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("÷");
		btnNewButton_1_1.setBackground(Color.ORANGE);
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "÷";
			}
		});
		btnNewButton_1_1.setBounds(346, 177, 102, 60);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_3 = new JButton("7");
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnNewButton_3.getText();
				textField.setText(num);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_3.setBounds(10, 248, 102, 60);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("8");
		btnNewButton_1_2.setBackground(Color.DARK_GRAY);
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnNewButton_1_2.getText();
				textField.setText(num);
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_2.setBounds(122, 248, 102, 60);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_2_1 = new JButton("9");
		btnNewButton_2_1.setBackground(Color.DARK_GRAY);
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnNewButton_2_1.getText();
				textField.setText(num);
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2_1.setBounds(234, 248, 102, 60);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_1_1_1 = new JButton("×");
		btnNewButton_1_1_1.setBackground(Color.ORANGE);
		btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "×";
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_1_1.setBounds(346, 248, 102, 60);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBackground(Color.DARK_GRAY);
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnNewButton_4.getText();
				textField.setText(num);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_4.setBounds(10, 319, 102, 60);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_1_3 = new JButton("5");
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.setBackground(Color.DARK_GRAY);
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnNewButton_1_3.getText();
				textField.setText(num);
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_3.setBounds(122, 319, 102, 60);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_2_2 = new JButton("6");
		btnNewButton_2_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2_2.setForeground(Color.WHITE);
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnNewButton_2_2.getText();
				textField.setText(num);
			}
		});
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2_2.setBounds(234, 319, 102, 60);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_1_1_2 = new JButton("-");
		btnNewButton_1_1_2.setBackground(Color.ORANGE);
		btnNewButton_1_1_2.setForeground(Color.WHITE);
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "-";
			}
		});
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_1_2.setBounds(346, 319, 102, 60);
		frame.getContentPane().add(btnNewButton_1_1_2);
		
		JButton btnNewButton_2_2_1 = new JButton("3");
		btnNewButton_2_2_1.setBackground(Color.DARK_GRAY);
		btnNewButton_2_2_1.setForeground(Color.WHITE);
		btnNewButton_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnNewButton_2_2_1.getText();
				textField.setText(num);
			}
		});
		btnNewButton_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2_2_1.setBounds(234, 390, 102, 60);
		frame.getContentPane().add(btnNewButton_2_2_1);
		
		JButton btnNewButton_1_3_1 = new JButton("2");
		btnNewButton_1_3_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1_3_1.setForeground(Color.WHITE);
		btnNewButton_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnNewButton_1_3_1.getText();
				textField.setText(num);
			}
		});
		btnNewButton_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_3_1.setBounds(122, 390, 102, 60);
		frame.getContentPane().add(btnNewButton_1_3_1);
		
		JButton btnNewButton_1_1_2_1 = new JButton("+");
		btnNewButton_1_1_2_1.setBackground(Color.ORANGE);
		btnNewButton_1_1_2_1.setForeground(Color.WHITE);
		btnNewButton_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "+";	
			}
		});
		btnNewButton_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_1_2_1.setBounds(346, 390, 102, 60);
		frame.getContentPane().add(btnNewButton_1_1_2_1);
		
		JButton btnNewButton_4_1 = new JButton("1");
		btnNewButton_4_1.setBackground(Color.DARK_GRAY);
		btnNewButton_4_1.setForeground(Color.WHITE);
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnNewButton_4_1.getText();
				textField.setText(num);
			}
		});
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_4_1.setBounds(10, 390, 102, 60);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_2_2_2 = new JButton(".");
		btnNewButton_2_2_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2_2_2.setForeground(Color.WHITE);
		btnNewButton_2_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnNewButton_2_2_2.getText();
				textField.setText(num);
			}
		});
		btnNewButton_2_2_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2_2_2.setBounds(234, 461, 102, 60);
		frame.getContentPane().add(btnNewButton_2_2_2);
		
		JButton btnNewButton_1_1_2_2 = new JButton("=");
		btnNewButton_1_1_2_2.setBackground(Color.ORANGE);
		btnNewButton_1_1_2_2.setForeground(Color.WHITE);
		btnNewButton_1_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				number2 = Double.parseDouble(textField.getText());
				if(operator == "+") {
					result = number1 + number2;
					answer = String.format("%.4f", result);
					textField.setText(answer);
				}
				else if(operator == "-") {
					result = number1 - number2;
					answer = String.format("%.4f", result);
					textField.setText(answer);
				}
				
				else if(operator == "×") {
					result = number1 * number2;
					answer = String.format("%.4f", result);
					textField.setText(answer);
				}
				
				else if(operator == "÷") {
					result = number1 / number2;
					answer = String.format("%.4f", result);
					textField.setText(answer);
				}
				
				else if(operator == "%") {
					result = number1 % number2;
					answer = String.format("%.4f", result);
					textField.setText(answer);
				}
				
				
			}
		});
		btnNewButton_1_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_1_2_2.setBounds(346, 461, 102, 60);
		frame.getContentPane().add(btnNewButton_1_1_2_2);
		
		JButton btnNewButton_4_2 = new JButton("0");
		btnNewButton_4_2.setBackground(Color.DARK_GRAY);
		btnNewButton_4_2.setForeground(Color.WHITE);
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnNewButton_4_2.getText();
				textField.setText(num);
			}
		});
		btnNewButton_4_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_4_2.setBounds(10, 461, 214, 60);
		frame.getContentPane().add(btnNewButton_4_2);
	}
}
