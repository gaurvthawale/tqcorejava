package com.enumdemo;

public enum MovieSeats {
	
	STANDARD(300),PREMIUM(400),RECLINER(500);
	
	int price;
	
	MovieSeats(int price) {
		// TODO Auto-generated constructor stub
		
		this.price=price;
	}
	
	
	

}
