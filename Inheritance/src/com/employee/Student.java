package com.employee;

public class Student extends Person{
	
	private int id;
	protected String course;
	
	Student()
	{
		
	}
	
	Student(String name,String gender, int age, int id, String course )
	{
		
		super(name, gender,age);
		
		System.out.println(" In student ctor..");
		this.id = id;
		this.course = course;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getCourse()
	{
		return course;
	}

	public void setCourse(String course)
	{
		this.course = course;
	}
	
	public String toString()
	{
		System.out.println("In student tostring..");
		return super.toString()+" "+id+" "+course;
	}
	
	

}
