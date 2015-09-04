package com.sapient.client.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.cui.Order;

public class OrderTest {
	Order order = new Order();
	

	@Before
	public void setUp() throws Exception {
		order.list.add(1);
		order.list.add(2);
		order.list.add(3);
		order.list.add(4);
		order.list.add(5);
		order.calcTotal();
		order.calcWeight();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testCalcTax() {
		
	}

	@Test
	public final void testCalcTotal() {
		
	}

	@Test
	public final void testCalcWeight() {
		
	}

}
