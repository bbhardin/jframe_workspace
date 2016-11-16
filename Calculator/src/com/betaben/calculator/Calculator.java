package com.betaben.calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	public int firstNumber;
	public int secondNumber;
	public String operator;
	public int value;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 300, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel display = new JLabel("");
		display.setBounds(6, 6, 488, 68);
		contentPane.add(display);
		
		JButton zeroButton = new JButton("0");
		zeroButton.setBounds(6, 381, 117, 90);
		zeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				display.setText(display.getText()+"0");
			}
		});
		contentPane.add(zeroButton);
		
		JButton oneButton = new JButton("1");
		oneButton.setBounds(6, 293, 117, 90);
		oneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				display.setText(display.getText()+"1");
			}
		});
		contentPane.add(oneButton);
		
		JButton twoButton = new JButton("2");
		twoButton.setBounds(123, 293, 117, 90);
		twoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				display.setText(display.getText()+"2");
			}
		});
		contentPane.add(twoButton);
		
		JButton threeButton = new JButton("3");
		threeButton.setBounds(240, 293, 117, 90);
		threeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				display.setText(display.getText()+"3");
			}
		});
		contentPane.add(threeButton);
		
		JButton fourButton = new JButton("4");
		fourButton.setBounds(6, 209, 117, 90);
		fourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				display.setText(display.getText()+"4");
			}
		});
		contentPane.add(fourButton);
		
		JButton fiveButton = new JButton("5");
		fiveButton.setBounds(123, 209, 117, 90);
		fiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				display.setText(display.getText()+"5");
			}
		});
		contentPane.add(fiveButton);
		
		JButton sixButton = new JButton("6");
		sixButton.setBounds(240, 209, 117, 90);
		sixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				display.setText(display.getText()+"6");
			}
		});
		contentPane.add(sixButton);
		
		JButton sevenButton = new JButton("7");
		sevenButton.setBounds(6, 121, 117, 90);
		sevenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				display.setText(display.getText()+"7");
			}
		});
		contentPane.add(sevenButton);
		
		JButton eightButton = new JButton("8");
		eightButton.setBounds(123, 121, 117, 90);
		eightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				display.setText(display.getText()+"8");
			}
		});
		contentPane.add(eightButton);
		
		JButton nineButton = new JButton("9");
		nineButton.setBounds(240, 121, 117, 90);
		nineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				display.setText(display.getText()+"9");
			}
		});
		contentPane.add(nineButton);
		
		JButton equalButton = new JButton("=");
		equalButton.setBounds(377, 310, 117, 162);
		equalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				//Remember to set what happened plus minus etc
				//Then do the calculations.
				if(operator != null){
					if(secondNumber > -1){
						secondNumber = Integer.valueOf(display.getText());
						if(operator == "+"){
							value = firstNumber+secondNumber;
						}
						if(operator == "-"){
							value = firstNumber-secondNumber;
						}
						if(operator == "*"){
							value = firstNumber*secondNumber;
						}
						if(operator == "/"){
							value = firstNumber/secondNumber;
						}
						System.out.println(value);
						display.setText(Integer.toString(value));
					}
					
				} else{
					firstNumber = Integer.valueOf(display.getText());
					display.setText(Integer.toString(firstNumber));
				}
			}
		});
		contentPane.add(equalButton);
		
		JButton divideButton = new JButton("÷");
		divideButton.setBounds(377, 257, 117, 55);
		divideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				firstNumber = Integer.valueOf(display.getText());
				operator = "/";
				display.setText("");
			}
		});
		contentPane.add(divideButton);
		
		JButton multiplyButton = new JButton("x");
		multiplyButton.setBounds(377, 209, 117, 48);
		multiplyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				firstNumber = Integer.valueOf(display.getText());
				operator = "*";
				display.setText("");
			}
		});
		contentPane.add(multiplyButton);
		
		JButton subtractButton = new JButton("-");
		subtractButton.setBounds(377, 146, 117, 29);
		subtractButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Integer.valueOf(display.getText());
				operator = "-";
				display.setText("");
			}
		});
		contentPane.add(subtractButton);
		
		JButton addButton = new JButton("+");
		addButton.setBounds(377, 103, 117, 29);
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				firstNumber = Integer.valueOf(display.getText());
				operator = "+";
				display.setText("");
			}
		});
		contentPane.add(addButton);
		
		JButton clearButton = new JButton("Clear");
		clearButton.setBounds(6, 103, 117, 29);
		clearButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				firstNumber = 0;
				secondNumber = 0;
				display.setText("");
			}
		});
		contentPane.add(clearButton);
	}
}
