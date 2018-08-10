package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestTrans {

	private static Transpose t;
	@BeforeClass
	public void setUp() 
	{
		t=new Transpose();
	}

	@AfterClass
	public void tearDown() 
	{
		t=null;
	}

	@Test
	public void transtest1() 
	{
		String s="a quick brown fox jumps over the lazy dog";
		String res="a kciuq nworb xof spmuj revo eht yzal god";
		String exp=t.strtrans(s);
		assertEquals(res,exp);
	}
	
	@Test
	public void transtest2() 
	{
		String s1="a quick brown fox jumps over the lazy dog";
		String res="a kciuq nworb xof spmuj revo eht yzal god";
		String exp=t.strtrans(s1);
		assertNotEquals(res,exp);
	}
	
	@Test
	public void transtest3() 
	{
		String s2="";
		String exp=t.strtrans(s2);
		assertEquals("No string passed",exp);
	}

}
