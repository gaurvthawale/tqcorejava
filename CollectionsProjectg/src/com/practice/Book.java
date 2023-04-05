package com.practice;

public class Book implements Comparable<Book> {

	private int bid;
	private String bname;
	private float price;
	private Author author;
	
	Book()
	{
		
	}

	public Book(int bid, String bname, float price, Author author) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;
		this.author = author;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", price=" + price + ", author=" + author + "]";
	}

	@Override
	public int compareTo(Book b) {
		
		return (int)(this.price-b.price);
	}
	
	
}
