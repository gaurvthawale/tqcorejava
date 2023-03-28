package com.hirarchical;

public class CollegeStudent extends Student {
	private String course;
	private int sem;
	
	CollegeStudent()
	{
		super();
	}
	
	CollegeStudent(int id, String name, int age, float fees,String course, int sem)
	{
		super(id,name,age,fees);
		System.out.println();
		this.course = course;
		this.sem = sem;
	}

	public String getCourse() 
	{
		return course;
	}

	public void setSchoolName(String course)
	{
		this.course = course;
	}

	public int getSem()
	{
		return sem;
	}

	public void setSem(int sem)
	{
		this.sem = sem;
	}
	
	public String toString()
	{
		System.out.println("TOSTRING of schoolstudent");
		return super.toString()+" "+course+" "+sem;
	}
	
	
}
