package com.sapient.client.cui;

public class OrderDetail {

int Quantity;
boolean Taxstatus;
Order order;
Item Item;
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

public void calcSubTotal()
{
}
public void calcWeight()
{
}

}





