package com.supplier;

public class SupplierCtor{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item[] items = new Item[4];
		
		items[0] = new Item(1,"pen",10f);
		items[1] = new Item(2,"utensils",10f);
		items[2] = new Item(3,"grocery",10f);
		items[3] = new Item(4,"pot",10f);
		
		Supplier[] sup = new Supplier[4];
		
		sup[0] =new Supplier(1,"gaurav","987654",items );
		
		Item[] i1 = new Item[3];
		
		i1[0] = new Item(1,"pen",10f);
		i1[1] = new Item(2,"utensils",10f);
		i1[2] = new Item(3,"grocery",10f);
		
		
		sup[1] =new Supplier(2,"vaibhav","987654",i1 );
		
		Item[] i2 = new Item[3];
		
		i2[0] = new Item(1,"pen",10f);
		i2[1] = new Item(2,"utensils",10f);
		i2[2] = new Item(3,"grocery",10f);
		
		
		sup[2] =new Supplier(3,"surya","987654",i2 );
		
		Item[] i4 = new Item[3];
		
		i4[0] = new Item(1,"pen",1000f);
		i4[1] = new Item(2,"utensils",150f);
		i4[2] = new Item(3,"grocery",100f);
		
		
		sup[3] =new Supplier(4,"mohit","98123456",i4 );
		
		
		
		for(Supplier s : sup)
		{
			System.out.println(s.getId()+" "+s.getSname()+" "+s.getPhoneNo());
			for(Item i : s.getItem())
			{
				System.out.println(i);
			}
			System.out.println("=============================================");
		}
		
		
	}

}
