package com.sapient.client.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.cui.Item;
import com.sapient.client.cui.OrderDetail;

public class OrderDetailTest {
	int quantity;
	Item item = new Item();
	
	OrderDetail orders = new OrderDetail();
	

	@Before
	public void setUp() throws Exception {
		orders.setQuantity(5);
		orders.list.add(1);
		orders.list.add(2);
		orders.list.add(3);
		orders.list.add(4);
		orders.list.add(5);
		item.setDescription(1);
		item.setPriceForQuantity(1000);
	//item.setShippingWeight(20);
	orders.setItem(item);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public final void testSetItem() {
		
		//fail("Not yet implemented");
	}


	@Test
	public final void testCalcSubTotal() {
		double expected = 5000;
		double actual = orders.calcSubTotal();
		//System.out.println(actual);
		assertEquals(expected, actual, 0.000);
		
		//System.out.println(orders.getQuantity());
		//fail("Not yet implemented");
	}

	@Test
	public final void testCalcWeight() {
		//fail("Not yet implemented");
	}

}
