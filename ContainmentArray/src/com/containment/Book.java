package com.containment;

public class Book {
	
	private int bid;
	private String bname;
	private float price;
	private Author author;
	
	Book()
	{
		
	}
	
	Book(int id, String bname, float price,Author author)
	{
		this.bid=id;
		this.bname=bname;
		this.price= price;
		this.author=author;
		
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
	
	public void setAuthor(Author author)
	{
		this.author=author;
				
	}
	
	public Author getAuthor()
	{
		return author;
	}
	
	
	public String toString()
	{
		return "Book:"+bid+" "+bname+" "+price+" "+author;
	}
	

}
