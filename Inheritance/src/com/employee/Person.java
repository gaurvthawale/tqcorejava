package com.employee;

public class Person {
	
	private String name;
	protected String gender;
	public int age;
	
	Person()
	{
		
	}

	public Person(String name, String gender, int age)
	{
		System.out.println("In person ctor..");
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString()
	{
		System.out.println("In person to string");
		return "Person: "+name+" "+gender+" "+age;
	}
	
	
}
