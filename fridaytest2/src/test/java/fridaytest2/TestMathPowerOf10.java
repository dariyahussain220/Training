package fridaytest2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMathPowerOf10 {

	MathPowerOf10 powerof=null;
	@Before
	public void setUp() throws Exception {
		powerof=new MathPowerOf10();
	}

	@Test
	public void testValueExist() {
		assertEquals("10 raised to the 6th power is a Million", powerof.powerOfTen(6));
	}

	@Test
	public void testValueNonExist(){
		assertEquals("There is no Single word for 10 raised to the 25th power", powerof.powerOfTen(25));
	}
}
