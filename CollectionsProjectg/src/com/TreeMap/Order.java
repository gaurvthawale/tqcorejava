package com.TreeMap;

public class Order {
	
	private int oid;
	private float oamount;
	
	Order()
	{
		
	}

	public Order(int oid, float oamount) {
		super();
		this.oid = oid;
		this.oamount = oamount;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public float getOamount() {
		return oamount;
	}

	public void setOamount(float oamount) {
		this.oamount = oamount;
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", oamount=" + oamount + "]";
	}
	
	

}
