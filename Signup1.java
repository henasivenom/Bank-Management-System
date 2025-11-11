package bank.management.sys;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;

import com.toedter.calendar.JDateChooser;
import java.awt.*;

public class Signup1 extends JFrame implements ActionListener {
	
	
	long random;
	JTextField nameTextField, dobTextField, emailTextField, cityTextField, stateTextField, pincodetextField, addressTextField, fnameTextField, pinTextField;
	JRadioButton male, female, married, unmarried, other;
	JButton next;
	JDateChooser dateChooser;
	
	
	public Signup1() {
		setTitle("Application Form");
		setLayout(null);
		
		Random ran = new Random();
		 random = Math.abs((ran.nextLong() % 9000L) + 1000L);
		
		JLabel formno = new JLabel("APPLICATION FORM NO " + random);
		formno.setBounds(140, 20, 600, 40);
		formno.setFont(new Font("Raleman" , Font.BOLD,38));
		add(formno);
		
		JLabel personalDetails = new JLabel("Page 1: Personal Details");
		personalDetails.setBounds(290, 80, 400, 30);
		personalDetails.setFont(new Font("Raleman", Font.BOLD,22));
		add(personalDetails);
		
		JLabel name = new JLabel("Name:");
		name.setBounds(100, 140, 100, 30);
		name.setFont(new Font("Raleman",Font.BOLD,20));
		add(name);
		
		 nameTextField = new JTextField();
		nameTextField.setBounds(300, 140, 400, 30);
		nameTextField.setFont(new Font("Raleman",Font.BOLD,20));
		add(nameTextField);
		
		JLabel fname = new JLabel("Fathers Name:");
		fname.setBounds(100, 190, 200, 30);
		fname.setFont(new Font("Raleman",Font.BOLD,20));
		add(fname);
		
		 fnameTextField = new JTextField();
		fnameTextField.setBounds(300, 190, 400, 30);
		fnameTextField.setFont(new Font("Raleman",Font.BOLD,20));
		add(fnameTextField);
		
		JLabel dob = new JLabel("Date Of Birth:");
		dob.setBounds(100, 240, 200, 30);
		dob.setFont(new Font("Raleman",Font.BOLD,20));
		add(dob);
		
		 dateChooser = new JDateChooser();
		dateChooser.setBounds(300, 240, 200, 30);
		add(dateChooser);
		
		JLabel gender = new JLabel("Gender:");
		gender.setBounds(100, 290, 100, 30);
		gender.setFont(new Font("Raleman",Font.BOLD,20));
		add(gender);
		
		 male = new JRadioButton("Male");
		male.setBounds(300, 290, 60, 30);
		male.setBackground(Color.white);
		add(male);
		
		 female = new JRadioButton("Female");
		female.setBounds(450, 290, 1200, 30);
		female.setBackground(Color.white);
		add(female);
		
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(male);
		genderGroup.add(female);
		
		JLabel email = new JLabel("Email:");
		email.setBounds(100, 340, 100, 30);
		email.setFont(new Font("Raleman",Font.BOLD,20));
		add(email);
		
		 emailTextField = new JTextField();
		emailTextField.setBounds(300, 340, 400, 30);
		emailTextField.setFont(new Font("Raleman",Font.BOLD,20));
		add(emailTextField);
		
		JLabel marital = new JLabel("Marital Status:");
		marital.setBounds(100, 390, 200, 30);
		marital.setFont(new Font("Raleman",Font.BOLD,20));
		add(marital);
		
		 married = new JRadioButton("Married");
		married.setBounds(300,390,100,30);
		married.setBackground(Color.white);
		add(married);
		
		 unmarried = new JRadioButton("Unmarried");
		unmarried.setBounds(450,390,120,30);
		unmarried.setBackground(Color.white);
		add(unmarried);
		
		 other = new JRadioButton("Other");
		other.setBounds(630,390,100,30);
		other.setBackground(Color.white);
		add(other);
		
		ButtonGroup maritalGroup = new ButtonGroup();
		maritalGroup.add(married);
		maritalGroup.add(unmarried);
		maritalGroup.add(other);
		
		JLabel address = new JLabel("Address:");
		address.setBounds(100, 440, 100, 30);
		address.setFont(new Font("Raleman",Font.BOLD,20));
		add(address);
		
		 addressTextField = new JTextField();
		addressTextField.setBounds(300, 440, 400, 30);
		addressTextField.setFont(new Font("Raleman",Font.BOLD,20));
		add(addressTextField);
		
		JLabel city = new JLabel("City:");
		city.setBounds(100, 490, 100, 30);
		city.setFont(new Font("Raleman",Font.BOLD,20));
		add(city);
		
		 cityTextField = new JTextField();
		cityTextField.setBounds(300, 490, 400, 30);
		cityTextField.setFont(new Font("Raleman",Font.BOLD,20));
		add(cityTextField);
		
		JLabel state = new JLabel("State:");
		state.setBounds(100, 540, 100, 30);
		state.setFont(new Font("Raleman",Font.BOLD,20));
		add(state);
		
		 stateTextField = new JTextField();
		stateTextField.setBounds(300, 540, 400, 30);
		stateTextField.setFont(new Font("Raleman",Font.BOLD,20));
		add(stateTextField);
		
		JLabel pin = new JLabel("Pincode:");
		pin.setBounds(100, 590, 100, 30);
		pin.setFont(new Font("Raleman",Font.BOLD,20));
		add(pin);
		
		 pinTextField = new JTextField();
		pinTextField.setBounds(300, 590, 400, 30);
		pinTextField.setFont(new Font("Raleman",Font.BOLD,20));
		add(pinTextField);
		
		 next = new JButton("Next");
		next.setBounds(620, 660, 80, 30);
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setFont(new Font("Raleway", Font.BOLD,14));
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.white);
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String formno = ""+random;
		String name = nameTextField.getText();
		String fname = fnameTextField.getText();
		String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		String gender = null;
		if(male.isSelected()) {
			gender = "Male";
		}
		else if (female.isSelected()) {
			gender = "Female";
		}
		
		String email = emailTextField.getText();
		String marital = null;
		if(married.isSelected()) {
			marital = "Married";
		}
		else if (unmarried.isSelected()) {
			marital = "Unmarried";
		}
		else if(other.isSelected()) {
			marital = "Other";
		}
		
		String address = addressTextField.getText();
		String city = cityTextField.getText();
		String pin = pinTextField.getText();
		String state = stateTextField.getText();		
		
		try {
			if(name.equals( "")) {
				JOptionPane.showMessageDialog(null, "Name is Required");
			}
			else {
				Conn c = new Conn();
				String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','" +gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
				c.s.executeUpdate(query);
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		new Signup1();

	}

}
