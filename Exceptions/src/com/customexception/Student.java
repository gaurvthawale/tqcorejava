package com.customexception;

public class Student {
	
	private int id;
	private String name;
	private float marks;
	
	Student()
	{
		
	}
	
	Student(int id,String name,float marks)
	{
		this.id=id;
		this.name= name;
		this.marks=marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws InvalidName {
		
		if(name.length()<4)
			throw new InvalidName();
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) throws InvalidMarks {
		
		if(marks<0 || marks>100)
			throw new InvalidMarks();
			
		this.marks = marks;
	}
	
	public String toString()
	{
		return "Student:"+id+" "+name+" "+marks;
	}

}
