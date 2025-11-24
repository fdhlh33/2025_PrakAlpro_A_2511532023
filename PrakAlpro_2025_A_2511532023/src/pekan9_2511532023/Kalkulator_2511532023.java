package pekan9_2511532023;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kalkulator_2511532023 {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulator_2511532023 window = new Kalkulator_2511532023();
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
	public Kalkulator_2511532023() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 308, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(21, 11, 250, 66);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace= null;
				if(textField.getText().length()>0)
				{
					StringBuilder str= new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace= str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnBackspace.setBounds(21, 91, 63, 50);
		frame.getContentPane().add(btnBackspace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(21, 138, 63, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(21, 186, 63, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(21, 235, 63, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(21, 280, 63, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(83, 91, 63, 50);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(83, 138, 63, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(83, 186, 63, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(83, 235, 63, 50);
		frame.getContentPane().add(btn2);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText() + btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(83, 280, 63, 50);
		frame.getContentPane().add(btnDot);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(146, 138, 63, 50);
		frame.getContentPane().add(btn9);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText() + btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBounds(146, 91, 63, 50);
		frame.getContentPane().add(btn00);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(146, 186, 63, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnPlus_2511532023 = new JButton("+");
		btnPlus_2511532023.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation= "+";
			}
		});
		btnPlus_2511532023.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus_2511532023.setBounds(208, 91, 63, 50);
		frame.getContentPane().add(btnPlus_2511532023);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(146, 235, 63, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second= Double.parseDouble(textField.getText());
				if(operation=="+") {
					result= first + second;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				} else if(operation=="-") {
					result= first - second;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				} else if(operation=="*") {
					result= first * second;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				} else if(operation=="/") {
					result= first / second;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				} else if(operation=="%") {
					result= first % second;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(146, 280, 63, 50);
		frame.getContentPane().add(btnEqual);
		
		JButton btnSub_2511532023 = new JButton("-");
		btnSub_2511532023.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation= "-";
			}
		});
		btnSub_2511532023.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub_2511532023.setBounds(208, 138, 63, 50);
		frame.getContentPane().add(btnSub_2511532023);
		
		JButton btnMul_2511532023 = new JButton("*");
		btnMul_2511532023.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation= "*";
			}
		});
		btnMul_2511532023.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMul_2511532023.setBounds(208, 186, 63, 50);
		frame.getContentPane().add(btnMul_2511532023);
		
		JButton btnDiv_2511532023 = new JButton("/");
		btnDiv_2511532023.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation= "/";
			}
		});
		btnDiv_2511532023.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDiv_2511532023.setBounds(208, 235, 63, 50);
		frame.getContentPane().add(btnDiv_2511532023);
		
		JButton btnPercent_2511532023 = new JButton("%");
		btnPercent_2511532023.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation= "%";
			}
		});
		btnPercent_2511532023.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPercent_2511532023.setBounds(208, 280, 63, 50);
		frame.getContentPane().add(btnPercent_2511532023);
	}
}
