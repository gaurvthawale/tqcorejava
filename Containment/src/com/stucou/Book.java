package com.stucou;

public class Book {
	
	private String bname;
	private int bid;
	private Author author;
	private float price;
	
	Book()
	{
		
	}

	public Book(String bname, int bid, Author author, float price) 
	{
		
		this.bname = bname;
		this.bid = bid;
		this.author = author;
		this.price = price;
	}

	public String getBname() 
	{
		return bname;
	}

	public void setBname(String bname) 
	{
		this.bname = bname;
	}

	public int getBid()
	{
		return bid;
	}

	public void setBid(int bid) 
	{
		this.bid = bid;
	}

	public Author getAuthor() 
	{
		return author;
	}

	public void setAuthor(Author author)
	{
		this.author = author;
	}

	public float getPrice()
	{
		return price;
	}

	public void setPrice(float price)
	{
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book :" + bname + " " + bid + " " + author ;
	}
	
	
	

}
