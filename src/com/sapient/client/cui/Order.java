package com.sapient.client.cui;
import java.util.*;
public class Order {
Date Date;
String status;
NewCustomer customer;
Payment payment;
int totalWeight;
double tax;
double total;
Item item;
OrderDetail orderdetail ;
public ArrayList<Integer> list=new ArrayList<Integer>();
public Date getDate() {
	return Date;
}
public void setDate(Date date) {
	Date = date;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public NewCustomer getCustomer() {
	return customer;
}
public void setCustomer(NewCustomer customer) {
	this.customer = customer;
}
public Payment getPayment() {
	return payment;
}
public void setPayment(Payment payment) {
	this.payment = payment;
}
public OrderDetail getOrderdetail() {
	return orderdetail;
}
public void setOrderdetail(OrderDetail orderdetail) {
	this.orderdetail = orderdetail;
}
public double calcTax()
{
	tax=12.5;
	double tax1 = payment.getAmount();
	tax = ((tax * tax1 )/100) ;   
    return tax;
}
public double calcTotal()
{
	orderdetail = new OrderDetail();
	total = orderdetail.calcSubTotal() + calcTax();
	return total;
}
public int calcWeight()
{
	item = new Item();
	totalWeight = (int) (item.getWeight() * orderdetail.getQuantity());
	return totalWeight;
}
}
