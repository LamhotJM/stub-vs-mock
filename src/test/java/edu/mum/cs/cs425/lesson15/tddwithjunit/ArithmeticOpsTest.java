package edu.mum.cs.cs425.lesson15.tddwithjunit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author lamhotjmsiagian
 *
 */
public class ArithmeticOpsTest {
	
	private ArithmeticOps arithOps = null;

	@Before
	public void setUp() throws Exception {
		this.arithOps = new ArithmeticOps();
	}

	@After
	public void tearDown() throws Exception {
		this.arithOps = null;
	}

	@Test
	public final void testAdd() {
		long expected = 3L;
		long actual = arithOps.add(2, 1);
		assertEquals(expected, actual);
	}

	@Test
	public final void testSubtract() {
		long expected = 1L;
		long actual = arithOps.subtract(2, 1);
		assertEquals(expected, actual);
	}

}
