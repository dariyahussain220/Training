package assignmentTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import assignments.RemoveDuplicates;

public class RemoveDuplicatesTest {

	RemoveDuplicates removing = null;

	@Before
	public void setUp() throws Exception {
		removing = new RemoveDuplicates();
	}

	@Test
	public void removingDupTestIn() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(5);
		int[] input = { 1, 2, 4, 5, 2, 1 };
		assertEquals(al, removing.removeDuplicate(input));
	}

	@Test
	public void removing_DupTestEmpty() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int[] input = {};
		assertEquals(al, removing.removeDuplicate(input));
	}

	@Test
	public void removingDupTestNull() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int[] input = null;
		assertEquals(al, removing.removeDuplicate(input));
	}

}
