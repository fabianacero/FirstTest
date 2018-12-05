package com.decameron.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.decameron.logic.Multiplication;

public class MultiplicationTest {

	public Multiplication multi;
	@Before
	public void getObject(){
		multi = new Multiplication();
	}
	
	@Test
	public void testMultiply() {
		double resultado = multi.multiply(2, 2);
		assertEquals("Al multiplicar 2 x 2 deberia dar 4 ", 4, resultado);
	}

	@Test
	public void testPow() {
		double resultado = multi.pow(2, 3);
		assertEquals("Al elevar 2 a 3 deberia dar 8", 8, resultado);
	}

}
