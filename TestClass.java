/* Programmer: Richard Haynes III
 * Assignment 4 Applet
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.Caret;
import java.text.NumberFormat;

public class TestClass extends Applet implements ActionListener {

	NumberFormat nf = NumberFormat.getInstance();//cleans up decimal places
	
	//code below creates the buttons
	JButton b1 = new JButton("Sum (+)");
	JButton b2 = new JButton("Product (*)");
	JButton b3 = new JButton("Difference (-)");
	JButton b4 = new JButton("Quotient (/)");
	JButton b5 = new JButton("1st number squared (^2)"); 
	JButton b6 = new JButton("2nd number squared (^2)");
	
	JTextField tx1 = new JTextField(10);//1st user input
	JTextField tx2 = new JTextField(10);//2nd user input
	JTextField tx3 = new JTextField(25);//output of user choice
	
	//code below creates the labels for user
	JLabel label = new JLabel("Enter first number");
	JLabel label2 = new JLabel("Enter second number");
	JLabel label3 = new JLabel("The result of your choice is");
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		double sum, product, difference, quotient, sq1, sq2;
		
		if(e.getSource() == b1)
		{
		//this part does the addition of two numbers
		String num1 = tx1.getText();
		double number1 = Double.parseDouble(num1);
		String num2 = tx2.getText();
		double number2 = Double.parseDouble(num2);
		sum = number1 + number2;
		tx3.setText("The 1st number add to the 2nd is " + nf.format(sum));
		}
		
		//this part does multiplication of two numbers
		if(e.getSource() == b2)
		{
			String num1 = tx1.getText();
			double number1 = Double.parseDouble(num1);
			String num2 = tx2.getText();
			double number2 = Double.parseDouble(num2);
			product = number1 * number2;
			tx3.setText("The 1st number multiplied by the 2nd is "+ nf.format(product));
		}
		
		//this part does subtraction of two numbers
		if(e.getSource() == b3)
		{
			String num1 = tx1.getText();
			double number1 = Double.parseDouble(num1);
			String num2 = tx2.getText();
			double number2 = Double.parseDouble(num2);
			difference = number1 - number2;
			tx3.setText("The 1st number minus the 2nd is " + nf.format(difference));
		}
		
		//this part does division of two numbers
		if(e.getSource() == b4)
		{
			String num1 = tx1.getText();
			double number1 = Double.parseDouble(num1);
			String num2 = tx2.getText();
			double number2 = Double.parseDouble(num2);
			quotient = number1 / number2;
			tx3.setText("The 1st number divided by the 2nd is " + nf.format(quotient));
			
		}
		
		//this part squares the first number
		if(e.getSource() == b5)
		{
			String num1 = tx1.getText();
			double number1 = Double.parseDouble(num1);
			String num2 = tx2.getText();
			double number2 = Double.parseDouble(num2);
			sq1 = number1 * number1;
			tx3.setText("The first number squared is " + nf.format(sq1));
		}
		
		//this part squares the second number
		if(e.getSource() == b6)
		{
			String num1 = tx1.getText();
			double number1 = Double.parseDouble(num1);
			String num2 = tx2.getText();
			double number2 = Double.parseDouble(num2);
			sq2 = number2 * number2;
			tx3.setText("The 2nd number squared is " + nf.format(sq2));
		}
		
	}	
	public void init()
	{
		//this code sets the beginning size of the applet
		this.setSize(new Dimension(325,500));
		
		//setting color for background/buttons
		setBackground(Color.black);
		b1.setForeground(Color.black);
		b2.setForeground(Color.black);
		b3.setForeground(Color.black);
		b4.setForeground(Color.black);
		b5.setForeground(Color.black);
		b6.setForeground(Color.black);
		
		//code below sets color of fonts for labels
		label.setForeground(Color.white);
		label2.setForeground(Color.white);
		label3.setForeground(Color.white);
		
		//adds the buttons and labels to GUI
		add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);//add buttons
		add(label);add(tx1);add(label2);//adds labels to text slots
		add(tx2);add(label3);add(tx3);
		
		//adds the job of the buttons
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
	}//end of init method

}//end of class

