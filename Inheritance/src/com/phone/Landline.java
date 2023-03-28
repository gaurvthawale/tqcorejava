package com.phone;

public class Landline extends Phone {
	
	private String conn;
	private String area;
	
	
	Landline()
	{
		
	}
	
	Landline(int id,long phoneno,float bill,String conn, String area)
	{
		super(id,phoneno,bill);
		this.conn = conn;
		this.area = area;
	}

	public String getConn() 
	{
		return conn;
	}

	public void setConn(String conn)
	{
		this.conn = conn;
	}

	public String getArea() 
	{
		return area;
	}

	public void setArea(String area)
	{
		this.area = area;
	}
	
	public String toString()
	{
		
		return super.toString()+" "+conn+" "+area;
	}

}
