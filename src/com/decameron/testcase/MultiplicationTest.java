package com.decameron.testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.decameron.logic.Multiplication;

import junit.framework.TestCase;

public class MultiplicationTest extends TestCase{

	public Multiplication multi;
	
	@Before
	public void setUp() throws Exception {
		multi = new Multiplication();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testMultiply() {
		double resultado = multi.multiply(2, 2);
		assertEquals("Al multiplicar 2 x 2 deberia dar 4 ", 4.0, resultado);
	}

	@Test
	public void testPow() {
		double resultado = multi.pow(2, 3);
		assertEquals("Al elevar 2 a 3 deberia dar 8", 8.0, resultado);
	}

}
