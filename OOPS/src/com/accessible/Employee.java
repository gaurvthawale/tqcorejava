package com.accessible;

public class Employee {
	
	int eid;
	String ename;
	float experience;
	float salary;
	
	public void enterDetails(int id, String name, float exp, float sal)
	{
		eid = id;
		ename = name;
		experience = exp;
		salary = sal;
	}
	
	public void displayDetails()
	{
		System.out.println(eid+" "+ename+" "+experience+" "+salary);
	}
	
	public void salaryIncrement()
	{
		salary = salary+(0.1f*salary);
	}
	

}
