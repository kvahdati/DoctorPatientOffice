package office.control;

import office.view.OfficeFrame;

public class OfficeController
{
	private OfficeFrame appFrame;

	private int patientCount;
	
	public OfficeController()
	{
		appFrame = new OfficeFrame();
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

}
