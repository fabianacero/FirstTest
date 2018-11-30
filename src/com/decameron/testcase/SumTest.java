package com.decameron.testcase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.decameron.logic.Sum;

import junit.framework.TestCase;

public class SumTest extends TestCase {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		Sum sum = new Sum();
		double resultado = sum.add(1.0, 1.0);
        assertEquals("Al sumar 1.0 y 1.0 deberia dar 2.0 ", 2.0, resultado);
	}

	@Test
	public void testSubs() {
		Sum sum = new Sum();
		double resultado = sum.subs(1.0, 1.0);
        assertEquals(0.0, resultado);
	}

}
