package com.override;


class Person
{
	String name;
	
	void display()
	{
		System.out.println("Class person..");
	}
}

class Employee extends Person
{
	float sal; 
	void display()
	{
		System.out.println("class employee..");
	}
	
}
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();

	}

}
