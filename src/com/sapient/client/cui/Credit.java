package com.sapient.client.cui;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Credit extends Payment implements Authorization {
	private long number;
	private String type;
	private Date expDate;
	
	private final Map<String,Long> cardDetails = new HashMap<String,Long>();
	public final void validCardDetails(){
		cardDetails.put("MasterCard",new Long(5196));
		cardDetails.put("Visa",new Long(8523));
	    
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	
	@Override
	public String authorized( String message) {
		// TODO Auto-generated method stub
		return  message;

	}
}