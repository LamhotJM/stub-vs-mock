package edu.mum.cs.cs425.lesson15.tddwithjunit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.mum.cs.cs425.lesson15.tddwithjunit.FibonacciGenerator;

public class FibonaccciGeneratorTest {
	
	private FibonacciGenerator fiboGenerator;

	@Before
	public void setUp() throws Exception {
		this.fiboGenerator = new FibonacciGenerator();
	}

	@After
	public void tearDown() throws Exception {
		this.fiboGenerator = null;
	}

	@Test
	public final void testGenerateFirstNFiboSequence() {
		int a = 0;
		int b = 1;
		int n = 10;
		String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34";
		String actual = this.fiboGenerator.generateFirstNFiboSequence(a, b, n);
		assertEquals(expected, actual);
	}

}
