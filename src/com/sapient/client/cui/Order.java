package com.sapient.client.cui;
import java.util.*;
public class Order {
Date Date;
String status;
NewCustomer customer;
Payment payment;
OrderDetail orderdetail;
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
public int calcTax()
{
	int tax=0;
	return tax;
}
public int calcTotal()
{
	int total=0;
	return total;
}
public int calcWeight()
{
	int totalWeight=0;
	return totalWeight;
}
}
