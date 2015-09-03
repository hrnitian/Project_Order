package com.sapient.client.cui;

import java.util.Date;

public class Credit extends Payment implements Authorization{
	int number;
	String type;
	Date expDate;
	public Object getNumber() {
		return number;
	}
	public void setNumber(Object number) {
		this.number = number;
	}
	public Object getType() {
		return type;
	}
	public void setType(Object type) {
		this.type = type;
	}
	public Object getExpDate() {
		return expDate;
	}
	public void setExpDate(Object expDate) {
		this.expDate = expDate;
	}
	
	public boolean authorized() {
		
	}
	

}
