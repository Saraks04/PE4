package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MatchTest {

	private static StrMatch s;
	@BeforeClass
	public void setUp() 
	{
		s=new StrMatch();
	}

	@AfterClass
	public void tearDown() 
	{
		s=null;
	}

	@Test
	public void test1() 
	{
		String s1="This is a string matcher";
		String res="Found at:1-3 Found at:4-6";
		String exp=s.matchstr(s1);
		assertEquals(res,exp);
	}
	
	@Test
	public void test2() 
	{
		String s2="This is a string matcher";
		String res="Found at:2-4 Found at:5-7";
		String exp=s.matchstr(s2);
		assertNotEquals(res,exp);
	}
	
	@Test
	public void test3() 
	{
		String s1="";
		String res="no string present";
		String exp=s.matchstr(s1);
		assertEquals(res,exp);
	}

}
