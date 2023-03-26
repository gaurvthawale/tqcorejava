package com.employee;

public class Department {
	
	private int did;
	private String dname;
	
	Department()
	{
		
	}
	
	Department(int id,String dname)
	{
		this.did=id;
		this.dname=dname;
	}

	public int getDid() 
	{
		return did;
	}

	public void setDid(int did)
	{
		this.did = did;
	}

	public String getDname()
	{
		return dname;
	}

	public void setDname(String dname) 
	{
		this.dname = dname;
	}
	
	public String toString()
	{
		return "Department:"+did+" "+dname;
	}
	
}
