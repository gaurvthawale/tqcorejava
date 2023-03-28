package com.abstractnew;


 class Homeloan extends Loan {
	 
	 Homeloan()
	 {
		 
	 }
	 
	 

	@Override
	void interestRate(float principal ,int years) {
		
		System.out.println("Interest rate is 10% p.a.");
		principal = 0.1f* principal* years;
		System.out.println("Toatal amount to be paid :"+principal);
		
	}
	
	

}
 
 class Goldloan extends Loan
 {

	@Override
	void interestRate(float principal, int years) {
		
		
	}
	 
 }
