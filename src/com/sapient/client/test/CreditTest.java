package com.sapient.client.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.cui.Credit;
import java.util.Date;
public class CreditTest {
	Credit credit;
	
	
	@Before
	public void setUp() throws Exception {
		credit.setNumber(12345678);
		credit.setType("Visa");
		credit.setExpDate(10/05/2050);
		 
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAuthorized() {
		fail("Not yet implemented");
	}

}
