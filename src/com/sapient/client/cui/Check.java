package com.sapient.client.cui;

public class Check extends Payment implements Authorization {
String name;
int bankID;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getBankID() {
	return bankID;
}
public void setBankID(int bankID) {
	this.bankID = bankID;
}
public boolean authorized()
{
	boolean authorize=true;
	return authorize;
}

}
