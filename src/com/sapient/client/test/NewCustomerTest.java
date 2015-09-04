package com.sapient.client.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.cui.NewCustomer;
import com.sapient.client.cui.Order;

public class NewCustomerTest {
	NewCustomer newcustomer= new NewCustomer();
	Order order =new Order();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetOrder() {
		
	}

	@Test
	public void testSetOrder() {
		
		
	
	}
	@Test
	public void testShowResult()
	{
		newcustomer.showresult(); 
	}

}
