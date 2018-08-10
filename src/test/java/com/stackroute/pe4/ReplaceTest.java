package com.stackroute.pe4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReplaceTest {
	private static Replacechar rp=new Replacechar();


	@Test
	public void test() {
		assertEquals("faity fry",rp.func("daily dry"));
		assertNotEquals("daily dry",rp.func("daily dry"));
		
	}

}