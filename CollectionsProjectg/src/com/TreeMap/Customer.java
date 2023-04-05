package com.TreeMap;

public class Customer {
	
	private int cid;
	private String cname;
	private int mobileno;
	
	Customer()
	{
		
	}

	public Customer(int cid, String cname, int mobileno) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mobileno=mobileno;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", mobileno=" + mobileno + "]";
	}
	
	

}
