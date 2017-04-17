package mav_Assign_Test;

import static org.junit.Assert.*;
import mav_Assignments.Prime_Factors;

import org.junit.Before;
import org.junit.Test;

public class Prime_Factors_Test {
	
	Prime_Factors factors=null;
	@Before
	public void setUp() throws Exception {
		factors=new Prime_Factors();
	}

	@Test
	public void PrimeFactor_test() {
		assertEquals("3 23", factors.finding_Primefactors(69));
	}
	@Test
	public void NonPrimeFactor_test(){
		assertEquals("Do not enter 0 or 1", factors.finding_Primefactors(0));
	}
}
