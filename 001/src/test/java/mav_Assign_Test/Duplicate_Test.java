
package mav_Assign_Test;

import static org.junit.Assert.*;
import mav_Assignments.Duplicate_Char;

import org.junit.Before;
import org.junit.Test;

public class Duplicate_Test {

	Duplicate_Char duplicate=null;
	@Before
	public void setUp() throws Exception {
		duplicate=new Duplicate_Char();
	}

	@Test
	public void removing_Duplicate_test() {		
		assertEquals("heworld",duplicate.removing_Duplicate("helloworld"));
	}
	@Test
	public void removing_Duplicate_test_Null(){
		assertEquals("Null is not allowed",duplicate.removing_Duplicate(null));
	}

}
