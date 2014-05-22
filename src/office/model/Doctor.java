package office.model;

public class Doctor
{
	private String name;
	private String specality;
	
	public Doctor()
	{
	
	}
	
	public Doctor(String name, String specality)
	{
		this.name = name;
		this.specality = specality;
	}

	public String getName()
	{
		return name;
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
