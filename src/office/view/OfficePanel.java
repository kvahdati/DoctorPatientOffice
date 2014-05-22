package office.view;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import office.control.OfficeController;

public class OfficePanel extends JPanel
{
	private OfficeController myController;
	private SpringLayout myLayout;
	private JCheckBox docdoc;
	private JCheckBox patientz;
	private JTextField patientID;
	private JTextArea symptomsLists;
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
			editButton = new JButton("edit");
			addButton = new JButton("")
			
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
