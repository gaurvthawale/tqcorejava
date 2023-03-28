package com.newdemo;

public class Circle implements Printable,Showable {

	
	
	public void print(float rad) {
		
		System.out.println("Circle is printing..");
		System.out.println("Area of circle: "+(rad*rad));
		
	}
	
	


	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("Round shape");
	}


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printable ci = new Circle();
		ci.s
		ci.area(4f);
		ci.print();
		
		
	}

	
	

}
