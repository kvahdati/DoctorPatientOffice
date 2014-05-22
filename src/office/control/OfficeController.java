package office.control;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import office.model.Doctor;
import office.model.Patient;
import office.view.OfficeFrame;

public class OfficeController
{
	private OfficeFrame appFrame;
	
	private Doctor[] doctors;
	private ArrayList<Patient> patients;

	private int patientCount;
	
	public OfficeController()
	{
		doctors = new Doctor[2];
		patients = new ArrayList<Patient>();
		patientCount = 0;
	}
	
	public OfficeFrame getAppFrame()
	{
		return appFrame;
	}

	public void setAppFrame(OfficeFrame appFrame)
	{
		this.appFrame = appFrame;
	}

	public int getPatientCount()
	{
		return patientCount;
	}

	public void setPatientCount(int patientCount)
	{
		this.patientCount = patientCount;
	}

	public void start()
	{
		appFrame = new OfficeFrame(this);
	}
	
	public void addPatient(String doctor, int age, String gender, ArrayList<String> symptoms)
	{
		if(patientCount < patients.size())
		{
			Patient tempPatient = new Patient(doctor, age, gender, symptoms);
			patients.add(tempPatient);
		}
		else
		{
			JOptionPane.showMessageDialog(appFrame, "The cubby is full. You are too mainstream to be included.");
		}
	}

}
