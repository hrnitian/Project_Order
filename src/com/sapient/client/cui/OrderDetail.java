package com.sapient.client.cui;

import java.util.ArrayList;
import java.util.Iterator;

import com.sapient.client.test.ItemTest;

public class OrderDetail {

int quantity;
boolean taxStatus;
Order order;
Item item = new Item();
Item obj=new Item();
ItemTest object = new ItemTest();
public ArrayList<Integer> list=new ArrayList<Integer>();

/*public void addItems()
{
	list.add(100);
	list.add(200);
	list.add(300);
	list.add(400);
	list.add(500);
	
}*/
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public boolean getTaxstatus() {
	return taxStatus;
}
public void setTaxstatus(boolean taxstatus) {
	this.taxStatus = taxstatus;
}
public Order getOrder() {
	return order;
}
public void setOrder(Order order) {
	this.order = order;
}
public Item getItem() {
	return item;
}
public void setItem(Item item) {
	this.item = item;
	
}

public double calcSubTotal()
{
	System.out.println(getItem().getDescription());
	Iterator<Integer> listIterator=list.iterator();
	while(listIterator.hasNext())
	{
		int index=0;
		int k=listIterator.next();
		if(k==getItem().getDescription())
		{
			obj=object.arrayItem[index];
			//System.out.println(obj.getPriceForQuantity());
			return  quantity*obj.getPriceForQuantity();
		}
		index++;
		
	}
	return 0.0;
}
public double calcWeight()
{
	return quantity*obj.getShippingWeight();
}

}





