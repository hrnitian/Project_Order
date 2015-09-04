package com.sapient.client.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.cui.Credit;

public class CreditTest {
	
	Credit creditTest;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Date dateTest;
	private final Map<String,Long> cardDetails = new HashMap<String,Long>();
	@Before
	public void setUp() throws Exception {
	creditTest=new Credit(); 
	creditTest.setType("MasterCard");
	creditTest.setNumber(5196);
	creditTest.setExpDate(dateTest);
	cardDetails.put("MasterCard",new Long(5196));
	cardDetails.put("Visa",new Long(8523));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetGetNumber() {
	creditTest=new Credit();
	creditTest.setNumber(5196);
	long actualNumber=creditTest.getNumber();
	assertEquals(5196, actualNumber);
	}
	
	@Test
	public void testSetGetType() {
	creditTest=new Credit();
	creditTest.setType("Visa");
	String actualType = creditTest.getType();
	assertEquals("Visa", actualType);
	}
	
	@Test
	public void testSetGetDate() {
	creditTest=new Credit();
	dateTest=new Date(2015,8,15);
	creditTest.setExpDate(dateTest);
	Date actualDate = creditTest.getExpDate();
	Date expectedDate = new Date(2015,8,15);
	assertEquals(expectedDate, actualDate);
	}
	
	
	/*@Test
	public void testAuthorizedInvalidCard() {
	creditTest.setExpDate(dateTest);
	String actual = creditTest.authorized();
	assertEquals("card has expired", actual);
	}*/
	
	@Test
	public void testAuthorizedCard() {
		String actual=null;
		creditTest=new Credit();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date expiryDate;
		Date currentDate;
		try {
			expiryDate = sdf.parse("2016-09-06");
			currentDate = new Date();
			if (sdf.format(currentDate).compareTo(sdf.format(expiryDate)) > 0)
					{
			
				    actual=creditTest.authorized("card has expired");
					}
		
	    System.out.println(expiryDate);
	    System.out.println(currentDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Iterator mapIteration;
		mapIteration = cardDetails.entrySet().iterator();
		long value = 0L;
		String key="";
		creditTest.setNumber(5196);
		creditTest.setType("MasterCard");
		value=creditTest.getNumber();
		key=creditTest.getType();
		while(mapIteration.hasNext())
		{
		Map.Entry mapEntry = (Map.Entry) mapIteration.next();
		if(creditTest.getNumber() == (Long)mapEntry.getValue() && creditTest.getType() == mapEntry.getKey() ){
			actual=creditTest.authorized("authorised card");
		}
		
	}
	
	assertEquals("authorised card", actual);
	}

}
