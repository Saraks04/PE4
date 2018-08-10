package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SortTest {

	private static Sort s;
	@BeforeClass
	public void setUp() 
	{
		s=new Sort();
	}

	@AfterClass
	public void tearDown() 
	{
		s=null;
	}

	@Test
	public void testSort1() 
	{
		String s1="Classes ObjectInputStream and ObjectOutputStream are high-level streams that"
				+"contain the methods for serializing and deserializing an object";
		String res="an and and are Classes contain deserializing for high-level methods object"
				+"ObjectInputStream ObjectOutputStream serializing streams that the";
		String act=s.sortpass(s1);
		assertEquals(res,act);
	}
	
	@Test
	public void testSort2() 
	{
		String s1="Classes ObjectInputStream and ObjectOutputStream are high-level streams that"
				+"contain the methods for serializing and deserializing an object";
		String res="an and and are Classes contain deserializing for high-level methods object"
				+"ObjectInputStream ObjectOutputStream serializing streams that the";
		String act=s.sortpass(s1);
		assertNotEquals(res,act);
	}

	@Test
	public void testSort3() 
	{
		String s1="";
		String act=s.sortpass(s1);
		assertEquals("No string",act);
	}
	
}
