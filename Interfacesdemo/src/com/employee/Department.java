package com.employee;

public class Department {

	private int id;
	private String location;
	private String dname;
	
	Department()
	{
		
	}
	
	Department(int id, String location, String dname)
	{
		this.id = id;
		this.dname = dname;
		this.location= location;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setDname(String dname)
	{
		this.dname = dname;
	}
	
	public String getDname()
	{
		return dname;
	}
	
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	public String getLocation()
	{
		return location;
	}
	public String toString()
	{
		return "Department: "+id+" "+dname+" "+location;
	}
	
}
