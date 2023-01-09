package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private String beginText = "";
	private int symbol = 0;
	private JTextField textField2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 269, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 39, 230, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton clearButton = new JButton("C");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		clearButton.setBounds(10, 90, 50, 50);
		frame.getContentPane().add(clearButton);
		
		JButton plusMinusButton = new JButton("+/-");
		plusMinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().contains("-")) {
					String text = "-" + textField.getText();
					textField.setText(text);
				}
				else
				{
					String text = textField.getText();
					textField.setText(text.substring(1));
				}
			}
		});
		plusMinusButton.setBounds(70, 90, 50, 50);
		frame.getContentPane().add(plusMinusButton);
		
		JButton percentButton = new JButton("%");
		percentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().compareTo("") != 0) {
					Double answer  = Double.parseDouble(textField.getText());
					answer /= 100;
					textField.setText("" + answer);
				}
			}
		});
		percentButton.setBounds(130, 90, 50, 50);
		frame.getContentPane().add(percentButton);
		
		JButton divideButton = new JButton("/");
		divideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (beginText.compareTo("") == 0) {
					beginText = textField.getText();
					textField.setText("");
					symbol = 3;
					textField2.setText(beginText + "/");
				}
			}
		});
		divideButton.setBounds(190, 90, 50, 50);
		frame.getContentPane().add(divideButton);
		
		JButton sevenButton = new JButton("7");
		sevenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + "7";
				textField.setText(text);
			}
		});
		sevenButton.setBounds(10, 150, 50, 50);
		frame.getContentPane().add(sevenButton);
		
		JButton fourButton = new JButton("4");
		fourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + "4";
				textField.setText(text);
			}
		});
		fourButton.setBounds(10, 210, 50, 50);
		frame.getContentPane().add(fourButton);
		
		JButton eightButton = new JButton("8");
		eightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + "8";
				textField.setText(text);
			}
		});
		eightButton.setBounds(70, 150, 50, 50);
		frame.getContentPane().add(eightButton);
		
		JButton nineButton = new JButton("9");
		nineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + "9";
				textField.setText(text);
			}
		});
		nineButton.setBounds(130, 150, 50, 50);
		frame.getContentPane().add(nineButton);
		
		JButton multiButton = new JButton("X");
		multiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (beginText.compareTo("") == 0) {
					beginText = textField.getText();
					textField.setText("");
					symbol = 2;
					textField2.setText(beginText + "x");
				}
			}
		});
		multiButton.setBounds(190, 150, 50, 50);
		frame.getContentPane().add(multiButton);
		
		JButton fiveButton = new JButton("5");
		fiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + "5";
				textField.setText(text);
			}
		});
		fiveButton.setBounds(70, 210, 50, 50);
		frame.getContentPane().add(fiveButton);
		
		JButton sixButton = new JButton("6");
		sixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + "6";
				textField.setText(text);
			}
		});
		sixButton.setBounds(130, 210, 50, 50);
		frame.getContentPane().add(sixButton);
		
		JButton minusButton = new JButton("-");
		minusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (beginText.compareTo("") == 0) {
					beginText = textField.getText();
					textField.setText("");
					symbol = 1;
					textField2.setText(beginText + "-");
				}
			}
		});
		minusButton.setBounds(190, 212, 50, 50);
		frame.getContentPane().add(minusButton);
		
		JButton oneButton = new JButton("1");
		oneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + "1";
				textField.setText(text);
			}
		});
		oneButton.setBounds(10, 270, 50, 50);
		frame.getContentPane().add(oneButton);
		
		JButton zeroButton = new JButton("0");
		zeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + "0";
				textField.setText(text);
			}
		});
		zeroButton.setBounds(10, 330, 115, 50);
		frame.getContentPane().add(zeroButton);
		
		JButton twoButton = new JButton("2");
		twoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + "2";
				textField.setText(text);
			}
		});
		twoButton.setBounds(70, 270, 50, 50);
		frame.getContentPane().add(twoButton);
		
		JButton threeButton = new JButton("3");
		threeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText() + "3";
				textField.setText(text);
			}
		});
		threeButton.setBounds(130, 270, 50, 50);
		frame.getContentPane().add(threeButton);
		
		JButton plusButton = new JButton("+");
		plusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (beginText.compareTo("") == 0) {
					beginText = textField.getText();
					textField.setText("");
					symbol = 0;
					textField2.setText(beginText + "+");
				}
			}
		});
		plusButton.setBounds(190, 272, 50, 50);
		frame.getContentPane().add(plusButton);
		
		JButton periodButton = new JButton(".");
		periodButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().contains(".")) {
					String text = textField.getText() + ".";
					textField.setText(text);
				}
			}
		});
		periodButton.setBounds(130, 330, 50, 50);
		frame.getContentPane().add(periodButton);
		
		JButton equalsButton = new JButton("=");
		equalsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double answer = 0.0;
				boolean divideByZero = false;
				if (!beginText.isEmpty()) {
					switch(symbol) {
						case 0:
							answer = Double.parseDouble(beginText) + Double.parseDouble(textField.getText());
							break;
						case 1:
							answer = Double.parseDouble(beginText) - Double.parseDouble(textField.getText());
							break;
						case 2:
							answer = Double.parseDouble(beginText) * Double.parseDouble(textField.getText());
							break;
						case 3:
							if (Double.parseDouble(textField.getText()) == 0) {
								divideByZero = true;
							}
							else {
								answer = Double.parseDouble(beginText) / Double.parseDouble(textField.getText());
							}
							break;
					}
					if (!divideByZero) {
						textField.setText("" + answer);
					}
					else {
						textField.setText("Error");
					}
					beginText = "";
					textField2.setText("");
				}
			}
		});
		equalsButton.setBounds(190, 332, 50, 50);
		frame.getContentPane().add(equalsButton);
		
		textField2 = new JTextField();
		textField2.setBounds(10, 10, 115, 19);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
	}
}
