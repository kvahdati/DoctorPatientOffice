package office.view;

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
	private JCheckBox docdoc;
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
			docdoc = new JCheckBox();
			patientz = new JComboBox<Patient>();
			patientID = new JTextField(15);
			symptomsList = new JTextArea(1,2);
			setupPanel();
			setupLayout();
			setupListeners();
		}
	 
	private void setupPanel()
	 {
		 
	 }
	 
	 private void setupLayout()
	 {
		 
	 }
	 
	 private void setupListeners()
	 {
		 
	 }
}
