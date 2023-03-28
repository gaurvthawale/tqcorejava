package com.cardriver;

public class Driver {
	
	private int id;
	private String name;
	
	Driver()
	{
		
	}
	
	Driver(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return "Driver:"+id+" "+name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
