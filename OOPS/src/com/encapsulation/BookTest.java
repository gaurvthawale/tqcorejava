package com.encapsulation;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		Book book = new Book();
		
		System.out.println("Enter book id");
		book.setBookId(sc.nextInt());
		System.out.println("Enter book name");
		book.setBookName(sc.next());
		System.out.println("Enter book author");
		book.setAuthor(sc.next());
		System.out.println("Enter book price");
		book.setPrice(sc.nextFloat());
		
		System.out.println(book.getBookId()+" "+book.getBookName()+" "+book.getAuthor()+" "+book.getPrice());
		System.out.println(book);

		
	}

}
