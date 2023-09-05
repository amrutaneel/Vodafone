package com.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginServiceTest {

	@Test
	public void testCheckUser() {
		//fail("Not yet implemented");
		LoginService ls = new LoginService();
		boolean result1 = ls.checkUser("akash@gmail.com", "123");
		boolean result2 = ls.checkUser("raj@gmail.com", "123");
		assertTrue(result1);
		assertFalse(result2);
	}

}
