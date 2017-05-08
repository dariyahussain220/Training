package fridaytest2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestStudent {

	Student student=null;
	GradeFinding grade=null;
	@Before
	public void setUp() throws Exception {
		student=new  Student(85, 78, true);
		grade=new GradeFinding();
	}

	@Test
	public void testGradeA() {
		assertEquals("Grade A", grade.printGrade(student));
	}
	@Test
	public void testGradeB(){
		student=new Student(80, 65, false);
		assertEquals("Grade B", grade.printGrade(student));
	}
	@Test
	public void testGradeC(){
		student=new Student(60, 65, true);
		assertEquals("Grade C", grade.printGrade(student));
	}
	@Test
	public void testGradeB2(){
		student=new Student(60, 65, false);
		assertEquals("Grade B", grade.printGrade(student));
	}
}
