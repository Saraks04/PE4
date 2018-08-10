package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class OccurenceTest {
	Occurence oc=new Occurence();

	@Test
	public void func() {
		char s='a';
		assertEquals(11,oc.func("java java again java is a java", s));
		assertNotEquals(11,oc.func("java", s));
		
		
		
	}
	
	

}