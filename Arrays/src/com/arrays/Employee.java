package com.arrays;

public class Employee {

	int id;
	String name;
	
	Employee()
	{
		
	}
	
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
