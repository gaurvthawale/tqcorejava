package com.encapsulation;

public class Book
{
	
	private int bookId;
	private String bookName;
	private String author;
	private float price;
	
	
	public int getBookId()
	{
		return bookId;
	}
	
	public void setBookId(int bookId)
	{
		this.bookId = bookId;
	}
	
	public String getBookName() 
	{
		return bookName;
	}
	
	public void setBookName(String bookName)
	{
		this.bookName = bookName;
	}
	
	public String getAuthor() 
	{
		return author;
	}
	
	public void setAuthor(String author)
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

	
	 public String toString() 
	 { 
		 return " "+bookName+" "+author+" "+price+"";
	 }
	
	
}
