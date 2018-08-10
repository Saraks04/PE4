package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class RegExpTest {

	private static RegExp r;
	@BeforeClass
	public static void setUp() 
	{
		r=new RegExp();
	}

	@AfterClass
	public void tearDown() throws Exception 
	{
		r=null;
	}

	@Test
	public void matchtest1() 
	{
		String s="This is Harry";
		boolean b=r.findmatch(s);
		assertEquals(true,b);
	}
	
	@Test
	public void matchtest2() {
		String s1="This is Harry";
		boolean b=r.findmatch(s1);
		assertNotEquals(true,b);
	}
	
	@Test
	public void matchtest3() 
	{
		String s2="This is John";
		boolean b=r.findmatch(s2);
		assertEquals(false,b);
	}

}
