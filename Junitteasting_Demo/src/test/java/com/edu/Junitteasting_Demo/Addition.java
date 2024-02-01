package com.edu.Junitteasting_Demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Addition {
	
	public int add(int a,int b) {
		return a+b;
	}
	@Test
	public void addition() {
		assertEquals(10, add(7,3));
		
	}
	public int sub(int a,int b) {
		return a-b;
	}
	@Test
	public void substraction() {
		assertEquals(3, sub(6,3));
	}
	public int mul(int a, int b) {
		return a*b;
	}
	@Test
	public void multiplecation() {
		assertEquals(6, mul(2,3));
	}
	public int div(int a,int b) {
		return a/b;
	}
	@Test
	public void division() {
		assertEquals(2,div(20,10));
	}
	public int mod(int a, int b) {
		return a%b;
	}
	@Test
	public void modulus() {
		assertEquals(0, mod(20,2));
	}
	
	@Test
	public void test2() {
		int a=4;
		assertTrue(a%2==0);
		System.out.println("even");
	}
	
	@Test
	public void test3() {
		int b=7;
		assertFalse(b%2==0);
		System.out.println("not even");
	}
	@Test
	public void test4() {
		int a=7;
		assertNotEquals(7, a%2==0);
		System.out.println("not equal");
		
	}
	@Test
	public void test5() {
		int a;
		assertNotNull(getClass());
		
	}
	@Test
	public void test6() {
		assertNull(null);
	}
	

}
