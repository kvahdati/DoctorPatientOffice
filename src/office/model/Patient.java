package office.model;

import java.util.ArrayList;

public class Patient
{
	private String name;
	private int age;
	private String gender;
	private ArrayList<String> symptoms;
	
	public Patient()
	{
		name = "Bob";
		age = 20;
		gender = "confused";
		symptoms = new ArrayList<String>();
	}

	public Patient(String name, int age, String gender, ArrayList<String> symptoms)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		symptoms = new ArrayList<String>();
		
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public ArrayList<String> getSymptoms()
	{
		return symptoms;
	}

	public void setSymptoms(ArrayList<String> symptoms)
	{
		this.symptoms = symptoms;
	}

}
