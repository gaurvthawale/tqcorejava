package com.hirarchical;

public class SchoolStudent extends Student {
	private String schoolName;
	private int std;
	
	SchoolStudent()
	{
		super();
	}
	
	SchoolStudent(int id, String name, int age, float fees,String schoolName, int std)
	{
		super(id,name,age,fees);
		System.out.println();
		this.schoolName =schoolName;
		this.std = std;
	}

	public String getSchoolName() 
	{
		return schoolName;
	}

	public void setSchoolName(String schoolName)
	{
		this.schoolName = schoolName;
	}

	public int getStd()
	{
		return std;
	}

	public void setStd(int std)
	{
		this.std = std;
	}
	
	public String toString()
	{
		System.out.println("TOSTRING of schoolstudent");
		return super.toString()+" "+schoolName+" "+std;
	}
	
	
}
