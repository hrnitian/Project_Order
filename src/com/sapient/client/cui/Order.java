package com.sapient.client.cui;
import java.util.*;
public class Order {
Date Date;
boolean status;
NewCustomer customer;
Payment payment;
OrderDetail orderdetail;
public Date getDate() {
	return Date;
}
public void setDate(Date date) {
	Date = date;
}
public Object getStatus() {
	return status;
}
public void setStatus(Object status) {
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
public int calcTax()
{
	return tax;
}
public int calcTotal()
{
	int total;
	return total;
}
public int calcWeight()
{
	int totalWeight;
	return totalWeight;
}
}
