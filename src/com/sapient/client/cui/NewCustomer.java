package com.sapient.client.cui;

import java.util.ArrayList;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class NewCustomer {
	String name;
	String address;
	Order order = new Order() ;
	public ArrayList<Order> arrayOrder=new ArrayList<Order>();
	static Logger log;
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public void showresult()
	{
		log = Logger.getLogger(NewCustomer.class.getName());
		BasicConfigurator.configure();
		log.info(order.calcTotal());
	}

	

}
