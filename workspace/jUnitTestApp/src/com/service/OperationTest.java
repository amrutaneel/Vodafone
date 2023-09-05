package com.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperationTest {

	@Test
	public void testAdd() {
		Operation op = new Operation();
		int result = op.add(100, 200);
		assertEquals(300, result);
	}

	@Test
	public void testSub() {
		Operation op = new Operation();
		int result = op.sub(1000, 500);
		assertEquals(500, result);
	}
	
	@Test
	public void testMul() {
		Operation op = new Operation();
		int result = op.mul(10, 2);
		assertEquals(20, result);
	}
	
	@Test
	public void testDiv() {
		Operation op = new Operation();
		int result = op.div(1000, 200);
		assertEquals(5, result);
	}
}
