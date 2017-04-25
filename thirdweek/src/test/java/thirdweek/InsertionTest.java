package thirdweek;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class InsertionTest {
	InsertionSort insertionSort=null;
	@Before
	public void setUp() throws Exception {
		insertionSort=new InsertionSort();
	}

	@Test
	public void insertion_test() {
		int array[]={2,6,4,7,9,5,1,6,15,11,10};
		assertEquals("1 2 4 5 6 6 7 9 10 11 15 ",insertionSort.insertionSorting(array));
	}
	@Test
	public void insertion_nulltest() {
		int array[]={};
		assertEquals("Array Elements are not Entered",insertionSort.insertionSorting(array));
	}
	@Test
	public void insertion_negtivetest() {
		int array[]={2,6,4,-7,-9,5,1,-6,15,-11,10};
		assertEquals("you have Entered -ve values",insertionSort.insertionSorting(array));
	}

}
