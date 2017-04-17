package mav_Assign_Test;

import static org.junit.Assert.*;
import mav_Assignments.Merge_Sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Merge_Sort_Test {

	Merge_Sort merge=null;
	@Before
	public void setUp() throws Exception {
		merge=new Merge_Sort();
	}
	
	@Test
	public void merge_test() {
		int[] arr1={1,3,7,10,13,15,22,34};
		int[] arr2={1,2,5,8,10,12,15};
		assertEquals("[1 1 2 3 5 7 8 10 10 12 13 15 15 22 34 ]", merge.toString(merge.mergeSort(arr1, arr2)));
	}
		
}
