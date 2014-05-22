package office.model;

public class Doctor
{
	private String name;
	private String specality;
	private String patientList;
	
	
	public void docBrown()
	{
		name = "Doc Brown";
		specality = "Time Travel";
	}
	
	public void docHurt()
	{
		name = "Doc Hurt";
		specality = "Space Travel";
	}
	
	public Doctor(String name, String specality)
	{
		this.name = name;
		this.specality = specality;
		this.patientList = patientList;
	}

	public String getName()
	{
		return name;
	}

	public String getPatientList()
	{
		return patientList;
	}

	public void setPatientList(String patientList)
	{
		this.patientList = patientList;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSpecality()
	{
		return specality;
	}

	public void setSpecality(String specality)
	{
		this.specality = specality;
	}
	
}
