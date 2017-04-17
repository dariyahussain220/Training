package mav_Assign_Test;

import static org.junit.Assert.*;
import mav_Assignments.Find_Missing_Number;

import org.junit.Before;
import org.junit.Test;

public class Find_Missing_Test {
	
	Find_Missing_Number findElem=null;
	@Before
	public void setUp() throws Exception {
		findElem=new Find_Missing_Number();
	}

	@Test
	public void Missing_Num_test() {
		int [] input={1,3,5,2,4,7,8,10,9};
	assertEquals(6,findElem.findMissing(input));
	}

}
