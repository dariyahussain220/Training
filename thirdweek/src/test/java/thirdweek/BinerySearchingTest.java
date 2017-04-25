package thirdweek;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class BinerySearchingTest {
	BinarySearch binerySearching=null;
	@Before
	public void setUp() throws Exception {
		binerySearching=new BinarySearch();
	}

	@Test
	public void existbinerySearchtest() {
		int array[]={2,6,4,7,9,5,1,6,15,11,10};
		assertEquals(8,binerySearching.binerySearch(array,15));
	}
	@Test
	public void nonExistbinerySearchtest() {
		int array[]={2,6,4,7,9,5,1,6,15,11,10};
		assertEquals(-1,binerySearching.binerySearch(array,25));
	}
}
