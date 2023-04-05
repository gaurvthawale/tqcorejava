package com.hashmap;

import java.util.Objects;

public class Book {

	private int id;
	private String bookName;
	private int price;
	
	Book()
	{
		
	}
	
	

	public Book(int id, String bookName,int price) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.price=price;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
	
	


	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public int hashCode() {
		return Objects.hash(bookName, id,price);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookName, other.bookName) && id == other.id && price==other.price;
	}



	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", price=" + price + "]";
	}



	
}
