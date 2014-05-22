package office.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import office.control.OfficeController;
import office.model.Patient;

public class OfficePanel extends JPanel
{
	private OfficeController myController;
	private SpringLayout myLayout;
	private JCheckBox docBrown;
	private JCheckBox docHert;
	private JComboBox patientz;
	private JTextField patientID;
	private JTextArea symptomsList;
	private JLabel title;
	private JLabel patientzLabel;
	private JLabel doctorLabel;
	private JLabel symptomsLabel;
	private JButton addButton;
	private JButton displayButton;
	private JButton editButton;
	private JTextField ageField;
	private JTextField genderField;
	private JTextField nameField;
	
	
	
	
	
	
	
	 OfficePanel(OfficeController myController)
		{
			this.myController = myController;
			myLayout = new SpringLayout();
			editButton = new JButton("EDIT");
			nameField = new  JTextField(15);
			genderField = new JTextField(15);
			nameField = new JTextField(15);
			
			addButton = new JButton("ADD");
			
			displayButton = new JButton("DISPLAY");
			
			
			title = new JLabel("Doctors of Space and Time");
			patientzLabel = new JLabel("Patients");
			doctorLabel = new JLabel("Doctors");
			
			symptomsLabel = new JLabel("Symptoms");
			myLayout.putConstraint(SpringLayout.SOUTH, patientzLabel, -101, SpringLayout.NORTH, symptomsLabel);
			myLayout.putConstraint(SpringLayout.WEST, symptomsLabel, 0, SpringLayout.WEST, editButton);
			docBrown = new JCheckBox("Doctor Brown");
			myLayout.putConstraint(SpringLayout.NORTH, docBrown, 17, SpringLayout.SOUTH, title);
			myLayout.putConstraint(SpringLayout.EAST, docBrown, -60, SpringLayout.EAST, this);
			docHert = new JCheckBox("Doctor Hert");
			myLayout.putConstraint(SpringLayout.NORTH, docHert, -4, SpringLayout.NORTH, doctorLabel);
			patientz = new JComboBox<Patient>();
			myLayout.putConstraint(SpringLayout.EAST, docHert, 0, SpringLayout.EAST, patientz);
			myLayout.putConstraint(SpringLayout.SOUTH, patientz, 0, SpringLayout.SOUTH, patientzLabel);
			myLayout.putConstraint(SpringLayout.EAST, patientzLabel, -77, SpringLayout.WEST, patientz);
			myLayout.putConstraint(SpringLayout.EAST, patientz, -175, SpringLayout.EAST, this);
			patientID = new JTextField(15);
			myLayout.putConstraint(SpringLayout.WEST, patientID, -151, SpringLayout.EAST, this);
			myLayout.putConstraint(SpringLayout.SOUTH, patientID, 0, SpringLayout.SOUTH, patientzLabel);
			myLayout.putConstraint(SpringLayout.EAST, patientID, 0, SpringLayout.EAST, docBrown);
			symptomsList = new JTextArea(1,2);
			myLayout.putConstraint(SpringLayout.NORTH, symptomsList, 267, SpringLayout.NORTH, this);
			myLayout.putConstraint(SpringLayout.NORTH, symptomsLabel, 5, SpringLayout.NORTH, symptomsList);
			myLayout.putConstraint(SpringLayout.WEST, symptomsList, 102, SpringLayout.WEST, this);
			myLayout.putConstraint(SpringLayout.SOUTH, symptomsList, -55, SpringLayout.NORTH, editButton);
			myLayout.putConstraint(SpringLayout.EAST, symptomsList, 0, SpringLayout.EAST, addButton);
			setupPanel();
			setupLayout();
			setupListeners();
		}
	 
	private void setupPanel()
	 {
		 this.setLayout(myLayout);
		 this.setSize(350,450);
		 this.add(editButton);
		 this.add(addButton);
		 this.add(displayButton);
		 this.add(title);
		 this.add(patientzLabel);
		 this.add(doctorLabel);
		 this.add(symptomsLabel);
		 this.add(docHert);
		 this.add(docBrown);
		 this.add(patientz);
		 this.add(patientID);
		 this.add(symptomsList);
	 }
	 
	 private void setupLayout()
	 {
		 myLayout.putConstraint(SpringLayout.WEST, editButton, 10, SpringLayout.WEST, this);
		 myLayout.putConstraint(SpringLayout.SOUTH, editButton, -10, SpringLayout.SOUTH, this); 
		 myLayout.putConstraint(SpringLayout.NORTH, addButton, -33, SpringLayout.SOUTH, this);
		 myLayout.putConstraint(SpringLayout.EAST, addButton, -10, SpringLayout.EAST, this);
		 myLayout.putConstraint(SpringLayout.WEST, addButton, -114, SpringLayout.EAST, this);
		 myLayout.putConstraint(SpringLayout.SOUTH, addButton, -10, SpringLayout.SOUTH, this);
		 myLayout.putConstraint(SpringLayout.WEST, displayButton, 120, SpringLayout.WEST, this);
		 myLayout.putConstraint(SpringLayout.EAST, editButton, -6, SpringLayout.WEST, displayButton);
		 myLayout.putConstraint(SpringLayout.NORTH, displayButton, -33, SpringLayout.SOUTH, this);
		 myLayout.putConstraint(SpringLayout.SOUTH, displayButton, -10, SpringLayout.SOUTH, this);
		 myLayout.putConstraint(SpringLayout.EAST, displayButton, -11, SpringLayout.WEST, addButton);
		 myLayout.putConstraint(SpringLayout.NORTH, title, 10, SpringLayout.NORTH, this);
		 myLayout.putConstraint(SpringLayout.WEST, title, 102, SpringLayout.WEST, this);
		 myLayout.putConstraint(SpringLayout.WEST, patientzLabel, 10, SpringLayout.WEST, this);
		 myLayout.putConstraint(SpringLayout.NORTH, patientzLabel, 83, SpringLayout.SOUTH, doctorLabel);
		 myLayout.putConstraint(SpringLayout.NORTH, doctorLabel, 45, SpringLayout.NORTH, this);
		 myLayout.putConstraint(SpringLayout.WEST, doctorLabel, 10, SpringLayout.WEST, this);
		 
		 
		 
	 }
	 
	 private void setupListeners()
	 {
		 addButton.addActionListener(new ActionListener()
		 {
			public void actionPerformed(ActionEvent click)
			{
				
			}
		 });
		 
		 displayButton.addActionListener(new ActionListener()
		 {
			public void actionPerformed(ActionEvent click)
			{
				
			}
		 });
		 
		 editButton.addActionListener(new ActionListener()
		 {
			public void actionPerformed(ActionEvent click)
			{
				
			}
		 });
	 }
}
