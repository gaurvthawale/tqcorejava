package com.arrayobjs;

public class Book {
	
	private int bid;
	private String bname;
	private float price;
	
	Book()
	{
		
	}
	
	Book(int id, String bname, float price)
	{
		this.bid=id;
		this.bname=bname;
		this.price= price;
		
	}
	
	public void setBid(int bid)
	{
		this.bid=bid;
	}
	
	public int getBid()
	{
		return bid;
	}
	
	public void setBname(String bname)
	{
		this.bname= bname;
	}
	
	public String getBname()
	{
		return bname;
	}
	
	public void setPrice(float price )
	{
		this.price=price;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	
	public String toString()
	{
		return "Book:"+bid+" "+bname+" "+price;
	}
	

}
