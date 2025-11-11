package bank.management.sys;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;

import com.toedter.calendar.JDateChooser;
import java.awt.*;

public class Signup2 extends JFrame implements ActionListener {
	
	JTextField panTextField, aadharTextField;
	JRadioButton seniorCitizenYes,seniorCitizenNo,exisitingAccountYes,exisitingAccountNo;
	JButton next;
	JDateChooser dateChooser;
	JComboBox religionname,categoryname,incomeRange,educationRange,occupationRange;
	String formno;
	
	
	public Signup2(String formno) {
		setTitle("NEW Account Application Form Page 2");
		setLayout(null);
		
		this.formno = formno;
		
		JLabel additionalDetails = new JLabel("Page 2: Additional Details");
		additionalDetails.setBounds(290, 80, 400, 30);
		additionalDetails.setFont(new Font("Raleman", Font.BOLD,22));
		add(additionalDetails);
		
		JLabel religion = new JLabel("Religion");
		religion.setBounds(100, 140, 100, 30);
		religion.setFont(new Font("Raleman",Font.BOLD,20));
		add(religion);
		
		String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
		religionname = new JComboBox(valReligion);
		religionname.setBounds(300,140,400,30);
		religionname.setBackground(Color.white);
		add(religionname);
		
		JLabel category = new JLabel("Category");
		category.setBounds(100, 190, 200, 30);
		category.setFont(new Font("Raleman",Font.BOLD,20));
		add(category);
		
		String valCategory[] = {"General","ST","SC","OBC","Other"};
		categoryname = new JComboBox(valCategory);
		categoryname.setBounds(300,190,400,30);
		categoryname.setBackground(Color.white);
		add(categoryname);
		
		JLabel income = new JLabel("Income");
		income.setBounds(100, 240, 200, 30);
		income.setFont(new Font("Raleman",Font.BOLD,20));
		add(income);
		
		String valIncome[] = {"Null","< 1,50,0000","< 2,50,0000","< 5,00,000", "upto 10,00000"};
		incomeRange = new JComboBox(valIncome);
		incomeRange.setBounds(300,240,400,30);
		incomeRange.setBackground(Color.white);
		add(incomeRange);
		
		JLabel education = new JLabel("Educational");
		education.setBounds(100, 290, 200, 30);
		education.setFont(new Font("Raleman",Font.BOLD,20));
		add(education);
		
		JLabel educationQualification = new JLabel("Qualification:");
		educationQualification.setBounds(100, 315, 200, 30);
		educationQualification.setFont(new Font("Raleman",Font.BOLD,20));
		add(educationQualification);
		
		String valEducation[] = {"Non-Graduate","Graduate","Post-Graduate","Doctorate", "Others"};
		educationRange = new JComboBox(valEducation);
		educationRange.setBounds(300,315,400,30);
		educationRange.setBackground(Color.white);
		add(educationRange);
		
		JLabel Occupation = new JLabel("Occupation:");
		Occupation.setBounds(100, 390, 200, 30);
		Occupation.setFont(new Font("Raleman",Font.BOLD,20));
		add(Occupation);
		
		String valOccupation[] = {"Salaried","Self-Employed","Business","Student", "Others"};
		occupationRange = new JComboBox(valOccupation);
		occupationRange.setBounds(300,390,400,30);
		occupationRange.setBackground(Color.white);
		add(occupationRange);
		
		JLabel panno = new JLabel("PAN Number:");
		panno.setBounds(100, 440, 200, 30);
		panno.setFont(new Font("Raleman",Font.BOLD,20));
		add(panno);
		
		 panTextField = new JTextField();
		 panTextField.setBounds(300, 440, 400, 30);
		 panTextField.setFont(new Font("Raleman",Font.BOLD,20));
		 add(panTextField);
		
		JLabel aadharno = new JLabel("Aadhar Number:");
		aadharno.setBounds(100, 490, 200, 30);
		aadharno.setFont(new Font("Raleman",Font.BOLD,20));
		add(aadharno);
		
		aadharTextField = new JTextField();
		aadharTextField.setBounds(300, 490, 400, 30);
		aadharTextField.setFont(new Font("Raleman",Font.BOLD,20));
		add(aadharTextField);
		
		JLabel seniorCitizen = new JLabel("Senior Citizen:");
		seniorCitizen.setBounds(100, 540, 200, 30);
		seniorCitizen.setFont(new Font("Raleman",Font.BOLD,20));
		add(seniorCitizen);
		
		seniorCitizenYes = new JRadioButton("Yes");
		seniorCitizenYes.setBounds(300,540,100,30);
		seniorCitizenYes.setBackground(Color.white);
		add(seniorCitizenYes);
		
		seniorCitizenNo = new JRadioButton("No");
		seniorCitizenNo.setBounds(450,540,120,30);
		seniorCitizenNo.setBackground(Color.white);
		add(seniorCitizenNo);
		
		ButtonGroup seniorCitizenGroup = new ButtonGroup();
		seniorCitizenGroup.add(seniorCitizenYes);
		seniorCitizenGroup.add(seniorCitizenNo);
		
		JLabel exisitingAccount = new JLabel("Existing Account:");
		exisitingAccount.setBounds(100, 590, 200, 30);
		exisitingAccount.setFont(new Font("Raleman",Font.BOLD,20));
		add(exisitingAccount);
		
		exisitingAccountYes = new JRadioButton("Yes");
		exisitingAccountYes.setBounds(300,590,100,30);
		exisitingAccountYes.setBackground(Color.white);
		add(exisitingAccountYes);
		
		exisitingAccountNo = new JRadioButton("No");
		exisitingAccountNo.setBounds(450,590,120,30);
		exisitingAccountNo.setBackground(Color.white);
		add(exisitingAccountNo);
		
		ButtonGroup exisitingAccountGroup = new ButtonGroup();
		exisitingAccountGroup.add(exisitingAccountYes);
		exisitingAccountGroup.add(exisitingAccountNo);
		
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
		String formno = "";
		String sreligion = (String) religionname.getSelectedItem();
		String category = (String)categoryname.getSelectedItem();
		String income = (String)incomeRange.getSelectedItem();
		String education = (String)educationRange.getSelectedItem();
		String occupation = (String)occupationRange.getSelectedItem();
		
		String seniorcitizen = null;
		if(seniorCitizenYes.isSelected()) {
			seniorcitizen = "Yes";
		}
		else if(seniorCitizenNo.isSelected()) {
			seniorcitizen = "No";
		}
		
		String exisitingaccount = null;
		if(exisitingAccountYes.isSelected()) {
			exisitingaccount = "Yes";
		}
		else if(exisitingAccountNo.isSelected()) {
			exisitingaccount = "No";
		}
		
		String span = panTextField.getText();
		
		String saadhar = aadharTextField.getText();
		
		try {
				Conn c = new Conn();
				String query = "insert into signup2 values('"+formno+"', '"+sreligion+"', '"+category+"', '"+income+"', " +"'"+education+"', '"+occupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+exisitingaccount+"')";				
				c.s.executeUpdate(query);
				
				setVisible(false);
		}
		catch (Exception e){
			System.out.println(e);
		}
		
	}


	public static void main(String[] args) {
		new Signup2("");

	}

}
