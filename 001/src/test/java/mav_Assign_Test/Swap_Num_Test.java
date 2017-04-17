package mav_Assign_Test;

import static org.junit.Assert.*;
import mav_Assignments.Swap_Num;

import org.junit.Before;
import org.junit.Test;

public class Swap_Num_Test {

	Swap_Num swap=null;
	@Before
	public void setUp() throws Exception {
		swap=new Swap_Num();
	}
	
	@Test
	public void swaping_test_in(){
		String arr="[100 250 ]";
		assertEquals(arr, swap.toString(swap.swaping(250,100)));
	}

}
