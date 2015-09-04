package com.sapient.client.cui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import com.sapient.client.test.ItemTest;

public class OrderDetail {

int Quantity;
boolean Taxstatus;
Order order;
Item Item;
Item obj=new Item();
ItemTest object = new ItemTest();
ArrayList<Integer> list=new ArrayList<Integer>();

public void addItems()
{
	list.add(100);
	list.add(200);
	list.add(300);
	list.add(400);
	list.add(500);
	
}
public int getQuantity() {
	return Quantity;
}
public void setQuantity(int quantity) {
	this.Quantity = quantity;
}
public boolean getTaxstatus() {
	return Taxstatus;
}
public void setTaxstatus(boolean taxstatus) {
	this.Taxstatus = taxstatus;
}
public Order getOrder() {
	return order;
}
public void setOrder(Order order) {
	this.order = order;
}
public Item getItem() {
	
	return Item;
}
public void setItem(Item item) {
	this.Item = item;
}

public double calcSubTotal()
{
	Iterator<Integer> listIterator=list.iterator();
	while(listIterator.hasNext())
	{
		int index=0;
		int k=listIterator.next();
		if(k==Item.description)
		{
			obj=object.arrayItem[index];
			return  (Quantity*obj.getPriceForQuantity());
		}
		index++;
		
	}
	return 0.0;
}
public double calcWeight()
{
	return Quantity*obj.getShippingWeight();
}

}





