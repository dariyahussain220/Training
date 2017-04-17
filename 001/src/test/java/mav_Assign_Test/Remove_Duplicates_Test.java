package mav_Assign_Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import mav_Assignments.Remove_Duplicates;

import org.junit.Before;
import org.junit.Test;

public class Remove_Duplicates_Test {

	Remove_Duplicates removing=null;
	@Before
	public void setUp() throws Exception {
		removing=new Remove_Duplicates();
	}

	@Test
	public void removing_Dup_test_in() {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(5);
		int[] input={1,2,4,5,2,1};
		assertEquals(al,removing.removedup(input));
	}
	@Test
	public void removing_Dup_test_Empty(){
		ArrayList<Integer> al=new ArrayList<Integer>();
		int[] input={};
		assertEquals(al, removing.removedup(input));
	}
	@Test
	public void removing_Dup_test_Null(){
		ArrayList<Integer> al=new ArrayList<Integer>();
		int[] input=null;
		assertEquals(al,removing.removedup(input));
	}

}
