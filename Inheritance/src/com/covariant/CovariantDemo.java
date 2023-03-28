package com.covariant;



class First
{
	Number value;
	
	Number display()
	{
		return value;
	}
}


class Second 
{
	Object value1;
	
	Object print()
	{
		return value1;
	}
}

class Third extends First
{
	Integer value1;
	{
		value1=10;
	}
	
	Integer display()
	{
		return value1 *value1;
	}
}

class Fourth extends Second
{
	Character ch ;
	
	Character print()
	{
		return ch;
	}
}

public class CovariantDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Third th = new Third();
		First fir;
		
		
	}

}
