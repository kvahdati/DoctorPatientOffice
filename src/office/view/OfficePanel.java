package office.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import office.control.OfficeController;
import office.model.Patient;

public class OfficePanel extends JPanel
{
	private OfficeController myController;
	private SpringLayout myLayout;
	private JCheckBox docBrown;
	private JCheckBox docHurt;
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
	private String doctorString;
	private String PatientName;
	private ArrayList<String> symptomList;
	private String Symptomzz;
	private String[] symptomArray;
	
	
	
	
	
	 OfficePanel(OfficeController myController)
		{
			this.myController = myController;
			myLayout = new SpringLayout();
			editButton = new JButton("EDIT");
			addButton = new JButton("ADD");
			displayButton = new JButton("DISPLAY");
			title = new JLabel("Doctors of Space and Time");
			patientzLabel = new JLabel("Patients");
			doctorLabel = new JLabel("Doctors");
			symptomsLabel = new JLabel("Symptoms");
			docBrown = new JCheckBox("Doctor Brown");
			docHurt = new JCheckBox("Doctor Hurt");
			patientz = new JComboBox<Patient>();
			patientID = new JTextField(15);
			symptomsList = new JTextArea(1,2);
			doctorString = new String("");
			PatientName = new String("");
			symptomList = new ArrayList<String>();
			setupPanel();
			setupLayout();
			setupListeners();
		}
	 
	private void setupPanel()
	 {
		 this.setLayout(myLayout);
		 this.setSize(550,450);
		 this.add(editButton);
		 this.add(addButton);
		 this.add(displayButton);
		 this.add(title);
		 this.add(patientzLabel);
		 this.add(doctorLabel);
		 this.add(symptomsLabel);
		 this.add(docHurt);
		 this.add(docBrown);
		 this.add(patientz);
		 this.add(patientID);
		 this.add(symptomsList);
	 }
	 
	 private void setupLayout()
	 {
		 
	 }
	 
	 private void setupListeners()
	 {
		 addButton.addActionListener(new ActionListener()
		 {
			public void actionPerformed(ActionEvent click)
			{
				if(docBrown != null)
				{
					doctorString = "Doc Brown";
				}
				else if(docHurt != null)
				{
					doctorString = "Doc Hurt";
				}
				else if(docBrown != null && docHurt != null)
				{
					JOptionPane.showMessageDialog(null, "You bloody twit. Choose one! Only one!");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You bloody twit. Choose one! At leat one!");
				}
				PatientName = patientID.getText();
				symptomArray = symptomsList.getText().split(",");
				for (String currentArray: symptomArray)
				{
					symptomList.add(currentArray);
				}
				
				
			
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
