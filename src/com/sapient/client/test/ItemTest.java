package com.sapient.client.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.client.cui.Item;

public class ItemTest {
	
	
	int shippingWeight;
	Item mouse = new Item();
	Item keyboard = new Item();
	Item pen = new Item();
	Item pencil = new Item();
	Item copy = new Item();
	public Item[] arrayItem = new Item[5];
	

	@Before
	public void setUp() throws Exception {
		mouse.setShippingWeight(100);
		mouse.setDescription(1);
		mouse.setPriceForQuantity(1000);
		keyboard.setShippingWeight(200);
		keyboard.setDescription(2);
		keyboard.setPriceForQuantity(2000);
		pen.setShippingWeight(300);
		pen.setDescription(3);
		pen.setPriceForQuantity(30);
		pencil.setShippingWeight(400);
		pencil.setDescription(4);
		pencil.setPriceForQuantity(40);
		copy.setShippingWeight(500);
		copy.setDescription(5);
		copy.setPriceForQuantity(50);
		
		arrayItem[0]=mouse;
		arrayItem[1]=keyboard;
		arrayItem[2]=pen;
		arrayItem[3]=pencil;
		arrayItem[4]=copy;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testSetshippingWeight() {
		//fail("Not yet implemented");
		int expected = 100;
		int actual = mouse.getShippingWeight();
		assertEquals(expected, actual);
	}

	@Test
	public final void testSetDescription() {
		//fail("Not yet implemented");
		int expected = 2;
		int actual = keyboard.getDescription();
		assertEquals(expected, actual);
	}
	
	@Test
	public final void testSetPriceForQuantity() {
		//fail("Not yet implemented");
		double expected = 50.0;
		double actual = copy.getPriceForQuantity();
		assertEquals(expected, actual, 0.000);
	}
	
	@Test
	public final void testgetWeight() {
		//fail("Not yet implemented");
		double expected = 80;
		double actual = mouse.getWeight();
		assertEquals(expected, actual, 0.000);
	}

}
