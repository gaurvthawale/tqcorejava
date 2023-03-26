package com.practice;

public class Student {
	
	private int id;
	private String name;
	
	Student()
	{
		
	}

	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	public void setName(String name) {
		this.name = name;
	}

	public static int compatreStudent(Student s1, Student s2)
	{
		return s1.getName().compareToIgnoreCase(s2.getName());
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	
	
}
