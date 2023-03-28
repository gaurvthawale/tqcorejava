package com.demo;

public class Patient extends Person {

     private String illness;
     private float bill;
          
    
    Patient()
    {
    	
    }
    
    Patient(String name, int age, String illness, float bill)
    {
    	super(name,age);
        this.illness=illness;
        this.bill=bill;
        
    }

	void checkStatus() {

       System.out.println("I am not well");
       System.out.println("I am suffering from:"+illness);
    
		
	}

	void moneyStatus(float salary) {
		System.out.println("I have spend:"+bill);
		
	}

	public String getIllness() {
		return illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}

	public float getBill() {
		return bill;
	}

	public void setBill(float bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "Patient ["+super.toString()+"illness=" + illness + ", bill=" + bill + "]";
	}

   

	
	

}
