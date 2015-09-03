package com.sapient.client.cui;

import java.util.Date;

public class Credit extends Payment implements Authorization{
	int number;
	String type;
	Date expDate;
	public Object getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Object getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Object getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	
	public boolean authorized() {
		boolean authorize=true;
		return authorize;
		
	}
	

}
