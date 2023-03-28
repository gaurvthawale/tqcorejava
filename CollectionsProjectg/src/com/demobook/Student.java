package com.demobook;

public class Student implements Comparable<Student>{

	private int id;
	private String name;
	private float marks;
	
	Student()
	{
		
	}

	public Student(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
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

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
	
		if(this.marks==o.marks)
			return this.name.compareTo(o.name);
		else if(this.marks>o.marks)
			return 1;
		
		else
			return 1;
	}
	
	
}
