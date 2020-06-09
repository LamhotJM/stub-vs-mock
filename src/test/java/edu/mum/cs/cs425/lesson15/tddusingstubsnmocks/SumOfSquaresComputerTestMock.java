package edu.mum.cs.cs425.lesson15.tddusingstubsnmocks;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.mum.cs.cs425.lesson15.tddusingstubsnmocks.SumOfSquaresComputer;
import edu.mum.cs.cs425.lesson15.tddusingstubsnmocks.service.ISquaresComputingService;

public class SumOfSquaresComputerTestMock {
	
	private SumOfSquaresComputer ssc;
	// This is a stubbed service object (i.e. fake/dummy/hardcoded service object)
//	private ISquaresComputingService sqCompService = new ISquaresComputingService() {
//		
//	
//		public int[] computesSquares(int[] ints) {
//			
////			return new int[] {0};
//			return new int[] {1,4,9};
//		}
//	}; 
	
	// This is a mocked service object; using the Mockito framework
	private ISquaresComputingService sqCompService2 = mock(ISquaresComputingService.class);

	@Before
	public void setUp() throws Exception {
		this.ssc = new SumOfSquaresComputer(sqCompService2);
	}

	@After
	public void tearDown() throws Exception {
		this.ssc = null;
	}

	@Test
	public final void testComputeSumOfSquares() {
//		int sumOfSquares = ssc.computeSumOfSquares(new int[] {1,2,3});
		when(sqCompService2.computesSquares(new int[] {1,2,3})).thenReturn(new int[] {1,4,9});
		int sumOfSquares = ssc.computeSumOfSquares(new int[] {1,2,3});
		assertThat(sumOfSquares, is(14));
		assertEquals(14, sumOfSquares);
		verify(sqCompService2).computesSquares(new int[] {1,2,3});
	}
}
