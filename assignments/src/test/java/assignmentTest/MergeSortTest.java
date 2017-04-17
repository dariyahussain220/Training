package assignmentTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import assignments.MergeSort;

public class MergeSortTest {

	MergeSort merge = null;

	@Before
	public void setUp() throws Exception {
		merge = new MergeSort();
	}

	@Test
	public void mergeTest() {
		int[] arr1 = { 1, 3, 7, 10, 13, 15, 22, 34 };
		int[] arr2 = { 1, 2, 5, 8, 10, 12, 15 };
		assertEquals("[1 1 2 3 5 7 8 10 10 12 13 15 15 22 34 ]",
				merge.toString(merge.mergeSort(arr1, arr2)));
	}

}
