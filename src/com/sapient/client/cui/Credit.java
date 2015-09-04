package com.sapient.client.cui;

import java.util.Calendar;
import java.util.Date;

public class Credit extends Payment implements Authorization{
	long  creditCardNumber;
	String cardType;

	Date expDate;
	String[] type={"Maestro" ,"Visa","Master card"};
	public Object getNumber() {
		return creditCardNumber;
	}
	public void setNumber(long  creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public Object getType() {
		return cardType;
	}
	public void setType(String cardType) {
		this.cardType = cardType;
	}
	public Object getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	
	public boolean authorized() {
		boolean authorize=true;
		Long number=this.creditCardNumber;
		String numberToString=number.toString();
		if(numberToString.length()==8)
		{
			for(String sample:type)
			{
				if(cardType.equals(sample))
				{   SimpleDateFormat f = new SimpleDateFormat("yyyy-mm-dd");
					Calendar cal=Calendar.getInstance(); 
					if((cal.after(expDate)))
					{
						return true;
					}
				}
			}
				
		}
		return false;
		
	}
	

}
