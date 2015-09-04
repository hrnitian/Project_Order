package com.sapient.client.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.cui.Check;

public class CheckTest {
	private final static Map<String, String> bankDetails = new HashMap<String, String>();

	Check check;

	@Before
	public void setUp() throws Exception {
		check = new Check();
		bankDetails.put("HDFCBank", "HDFC000000");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getSetNametest() {
		String expected = "HDFCBank";
		String actual = null;
		check = new Check();
		check.setName("HDFCBank");
		actual = check.getName();
		assertEquals(expected, actual);
	}

	@Test
	public void getSetBankIdtest() {
		String expected = "HDFC0000000";
		String actual = null;
		check = new Check();
		check.setBankID("HDFC0000000");
		actual = check.getBankID();
		assertEquals(expected, actual);
	}

	@Test
	public void authorizedTest() {
		String actual = null;
		check = new Check();
		check.setBankID("HDFC000000");
		check.setName("HDFCBank");
		Iterator <Map.Entry<String,String>>mapIterator=bankDetails.entrySet().iterator();
		while(mapIterator.hasNext()){
		      Map.Entry<String, String>entry= mapIterator.next();
		      String name=entry.getKey();
		      String bankid=entry.getValue();
		      System.out.println(name+" "+bankid);
		      if((name==check.getName())&&(bankid==check.getBankID())){
		    	  actual=check.authorized("Check Authorized");
		      }
		      else{
		    	  actual=check.authorized("Check not Authorized");
		      }
				
			}
		String expected = "Check Authorized";
		
		assertEquals(expected, actual);
	}
}
