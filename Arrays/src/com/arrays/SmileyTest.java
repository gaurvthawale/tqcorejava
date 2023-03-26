package com.arrays;

public class SmileyTest {

	final static int num=10;

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Smile s= new Smile();
		talk(s);
		s.frown();
		Ismile ia2 = s;
		final int f;
		f=10;
		

	}
	
	public static void talk(Ismile ia1)
	{
		System.out.println(" >>>>");
		ia1.smile();
		
	}

}

interface Ismile
{
	void smile();
}

class Smile implements Ismile
{

	@Override
	public void smile() {
		// TODO Auto-generated method stub
		System.out.println("Smile method of smile class");
	}
	
	void frown()
	{
		Ismile ia = new Smile();
		ia.smile();
		System.out.println("frown method of smile class");
	}
	
}
