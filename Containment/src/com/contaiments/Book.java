package com.contaiments;

public class Book {
	
	private int id;
	private String bname;
	private float price;
	private Author author;
	
	Book()
	{
		
	}
	
	Book(int id, String bname, float price, Author author)
	{
		this.id = id;
		this.bname = bname;
		this.price = price;
		this.author = author;
	}
	
	
	public int getId() 
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getBname() 
	{
		return bname;
	}

	public void setBname(String bname)
	{
		this.bname = bname;
	}

	public float getPrice()
	{
		return price;
	}

	public void setPrice(float price)
	{
		this.price = price;
	}

	public void setAuthor(Author author)
	{
		this.author= author;
	}
	
	public Author getAuthor()
	{
		return author;
	}
	
	public String toString()
	{
		return "Book: "+id+" "+bname+" "+price+" "+author;
	}

}
