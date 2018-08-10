package com.stackroute.pe4;

import static org.junit.Assert.*;

import static org.junit.Assert.assertNotEquals;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;


public class LongestTest {
	private static LongestString ls;
	@BeforeClass
	public static void setup() {
	ls=new LongestString();
	}
	@AfterClass
	public static void tearDown()
	{
		ls=null;
	}
	@Test
	public void func1() {
		assertEquals("abababaaaabababa",ls.func("aabbccabababaaaabababacbabccbcbcb"));
		
		
		assertNotEquals("aabbccabababaaaabababb",ls.func("aabbccabababaaaabababacbabccbcbcb"));
		
		
	}
}