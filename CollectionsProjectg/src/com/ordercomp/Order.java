package com.ordercomp;

public class Order implements Comparable<Order> {
	
	private int oid;
	private String oname;
	private float oprice;
	
	Order()
	{
		
	}

	public Order(int oid, String oname, float oprice) {
	
		this.oid = oid;
		this.oname = oname;
		this.oprice = oprice;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public float getOprice() {
		return oprice;
	}

	public void setOprice(float oprice) {
		this.oprice = oprice;
	}


	public String toString() {
		return "Order [oid=" + oid + ", oname=" + oname + ", oprice=" + oprice + "]";
	}

	@Override
	public int compareTo(Order o) {
		
		if(this.oprice==o.oprice)
			return this.oname.compareTo(o.oname);
		else if(this.oprice>o.oprice)
			return 1;
		else 
			return -1;
	}
	
	
	
	

}
