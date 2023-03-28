package com.hirarchical;

public class Student {
	
	private int id;
	private String name;
	private int age;
	private float fees;
	
	
	Student()
	{
		
	}

	

	public Student(int id, String name, int age, float fees) 
	{
		
		System.out.println("Ctor of student..");
		this.id = id;
		this.name = name;
		this.age = age;
		this.fees = fees;
	}



	public int getId() 
	{
		return id;
	}


	public void setId(int id) 
	{
		this.id = id;
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


	public float getFees()
	{
		return fees;
	}


	public void setFees(float fees)
	{
		this.fees = fees;
	}



	@Override
	public String toString() {
		System.out.println("To string of student");
		return "Student : " + id + " " + name + " " + age + " " + fees;
	}
	
	
	

}
