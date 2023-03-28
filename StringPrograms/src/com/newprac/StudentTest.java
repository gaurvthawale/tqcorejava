package com.newprac;

import java.util.Arrays;

class Student {
	
	private int id;
	private String name;
	private int[] marks;
	
	Student()
	{
		marks=new int[5];
	}
	
	Student(int id,String name)
	{
		this.id= id;
		this.name=name;
		this.marks= new int[5];
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

	public int[] getMarks()
	{
		return marks;
	}

	public void setMarks(int[] marks)
	{
		this.marks = marks;
	}

	
	public String toString() {
		return "Student: " + id + " " + name + " " + Arrays.toString(marks) ;
	}
	
	public void displayStudent()
	{
		int sum = 0;
		float per;
		
		for(int m : this.marks)
		{
			sum = sum+m;
		}
		per = sum/5;
		System.out.println("Student "+this.name+" Percentage is :  "+per);
	}
	
	
}


public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();

		s.displayStudent();
		
		
		
	}

}
