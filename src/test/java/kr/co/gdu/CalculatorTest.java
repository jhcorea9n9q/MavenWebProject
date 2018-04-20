package kr.co.gdu;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import kr.co.gdu.Calculator;

public class CalculatorTest {

	Calculator CL;
	int a, b;
	
	@Before
	public void before() {
		System.out.println("before()");
		CL = new Calculator();
		a = 4;
		b = 7;
	}
	
	@Test
	public void test() {
		System.out.println("test()");
		int AD = CL.add(a, b);
		int SB = CL.subtract(AD, b);
		int MT = CL.multiply(SB, a);
		int DV = CL.divide(MT, a);
		assertEquals(a, DV);
		
	}

	@After
	public void after() {
		System.out.println("after()");
	}
}
