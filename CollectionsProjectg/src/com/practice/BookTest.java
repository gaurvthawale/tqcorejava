package com.practice;

import java.util.ArrayList;

public class BookTest {

	public static void main(String[] args) {
	
		ArrayList<Book> al = new ArrayList<>();
		
		Author a1 = new Author(1,"Vivekananda");
		Author a2 = new Author(2,"saint tukaram");
		Author a3 = new Author(3,"saint dnyaneshwar");
		
		al.add(new Book(2,"dnyaneshwari",300f,a3));
		al.add(new Book(2,"dnyaneshwari",300f,a1));
		al.add(new Book(2,"dnyaneshwari",300f,a2));
		al.add(new Book(2,"dnyaneshwari",300f,a1));
		
		
		

	}

}
