package thirdweek;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class LinearSearchTest {
	LinearSearch linearSearch=null;
	@Before
	public void setUp() throws Exception {
		linearSearch=new LinearSearch();
	}

	@Test
	public void insertionTest() {
		int array[]={2,4,5,65,8,9,45,8,56};
		assertEquals(5,linearSearch.searchElement(array,9));
	}
	@Test
	public void nonInsertionTest() {
		int array[]={2,6,4,7,9,5,1,6,15,11,10};
		assertEquals(-1,linearSearch.searchElement(array,25));
	}
	
}
