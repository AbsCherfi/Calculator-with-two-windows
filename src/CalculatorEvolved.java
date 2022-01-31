import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;
import java.util.Iterator;

public class CalculatorEvolved implements ActionListener {
	private JFrame frame;
	private JTextField textfield;
	private JButton[] numberButtons = new JButton[10];
	private JButton[] functionButtons = new JButton[9];
	private JPanel panel;
	private Font font;
	private double num1;
	private double num2;
	private double result;
	private char operator;
	private JButton addButton, subButton, mulButton, divButton ;
	private JButton decButton, equButton, delButton, clrButton, negButton;
	private ImageIcon image;
	private JLabel label;
	private JLabel label1;
	private ImageIcon icon;
	private JButton moreOptions;
	
	public CalculatorEvolved() {
		image = new ImageIcon("ninja (1).png");
		icon = new ImageIcon("save-nature.png");
		
		moreOptions = new JButton("<<-]");
		moreOptions.setBounds(0, 33, 40, 30);
		moreOptions.addActionListener(this);
		//moreOptions.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		moreOptions.setForeground(Color.cyan);
		moreOptions.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		moreOptions.setFocusable(true);
		
		
		Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY,6);
		
		panel = new JPanel();
		label1 = new JLabel();
		
		font = new Font("Ink Free", Font.BOLD, 20);
		
		

		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 500);
		frame.setLayout(null);
		
		//panel.setBackground(Color.lightGray);
		//panel.setSize(400, 500);
		
	
		
		
		textfield = new JTextField();
		textfield.setBounds(50, 25, 300, 50);
		textfield.setFont(font);
		textfield.setEditable(false);
		

		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("Delete");
		clrButton = new JButton("Clear");
		negButton = new JButton("(-)");

		functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = mulButton;
		functionButtons[3] = divButton;
		functionButtons[4] = decButton;
		functionButtons[5] = equButton;
		functionButtons[6] = delButton;
		functionButtons[7] = clrButton;
		functionButtons[8] = negButton;


		for (int i = 0; i < 9; i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setBackground(Color.yellow);//set the background colour of the button to grey
			functionButtons[i].setBorder(BorderFactory.createEtchedBorder());
			functionButtons[i].setForeground(Color.cyan);
			functionButtons[i].setFont(font);
			functionButtons[i].setFocusable(false);
		}

		for (int i = 0; i < 10; i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].setBackground(Color.red);//set the background colour of the button to grey
			//numberButtons[i].setBorder(BorderFactory.createEtchedBorder());
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(font);
			numberButtons[i].setFocusable(false);

		}
		
		negButton.setBounds(50, 400, 80, 50);
		negButton.setForeground(Color.cyan);
		negButton.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		
		delButton.setBounds(160, 400, 80, 50);
		delButton.setForeground(Color.cyan);
		delButton.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		
		clrButton.setBounds(270, 400, 80, 50);
		clrButton.setForeground(Color.cyan);
		clrButton.setBorder(BorderFactory.createLoweredSoftBevelBorder());
		
		
		label1.setBackground(Color.lightGray);
		label1.setSize(400, 500);
		label1.setIcon(icon);
		label1.setBackground(Color.gray);
		label1.setOpaque(true);
		
		
		label= new JLabel();
		label.setIcon(image);
		label.setBounds(50, 100, 300, 280);
		//label.setBounds(100, 100, 300, 280);
		label.setLayout(new GridLayout(4, 4, 10, 10));
		label.setBackground(Color.GRAY);
		label.setOpaque(true);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBorder(border);
		//label.setVisible(true);
		
		
		
		
		
//		
//		
//		
//		
//		
		label.add(numberButtons[1]);
		label.add(numberButtons[2]);
		label.add(numberButtons[3]);
		label.add(addButton);
//		
//
		label.add(numberButtons[4]);
		label.add(numberButtons[5]);
		label.add(numberButtons[6]);
		label.add(subButton);
//
		label.add(numberButtons[7]);
		label.add(numberButtons[8]);
		label.add(numberButtons[9]);
		label.add(mulButton);
		label.add(decButton);
		label.add(numberButtons[0]);
		label.add(equButton);
		label.add(divButton);
//
		num1 = 0;
		num2 = 0;
		result = 0;
//		
//		
		frame.add(moreOptions);
		
		frame.add(label);
		frame.add(negButton);
//
		frame.add(delButton);
		frame.add(clrButton);
		frame.add(textfield);
		frame.setResizable(false);
		frame.add(label1);
		frame.setVisible(true);

	}

	public static void main(String[] args) {

		CalculatorEvolved calculator = new CalculatorEvolved();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < 10; i++) {
			if (e.getSource() == numberButtons[i]) {
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
			}
		}

		if (e.getSource() == decButton) {
			textfield.setText(textfield.getText().concat(String.valueOf(".")));

		} else if (e.getSource() == addButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '+';
			textfield.setText("");

		} else if (e.getSource() == subButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '-';
			textfield.setText("");

		} else if (e.getSource() == mulButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '*';
			textfield.setText("");
		} else if (e.getSource() == divButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '/';
			textfield.setText("");
		}
		if (e.getSource() == equButton) {
			num2 = Double.parseDouble(textfield.getText());
			switch (operator) {
			case '+':
				result = num1 + num2;
				break;

			case '-':
				result = num1 - num2;
				break;

			case '*':
				result = num1 * num2;
				break;

			case '/':
				result = num1 / num2;
				break;

			}

			textfield.setText(String.valueOf(result));
			num1 = result;

		}
		if (e.getSource() == clrButton) {

			textfield.setText("");
		}
		if (e.getSource() == delButton) {
			String text = textfield.getText();
			textfield.setText("");
			for(int i = 0; i < text.length()-1 ;i++) {
				textfield.setText(textfield.getText() + text.charAt(i));
			}
		}
		
		if (e.getSource() == negButton) {
			double temp = Double.parseDouble(textfield.getText());
			temp = temp * (-1);
			textfield.setText(String.valueOf(temp));
			}
		if(e.getSource() == moreOptions) {
			textfield.setText("Transferring you");
			new SecondPage();
		}
		
		
	}

}
