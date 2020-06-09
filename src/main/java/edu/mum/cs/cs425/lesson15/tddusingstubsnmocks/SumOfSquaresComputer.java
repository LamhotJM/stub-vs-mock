package edu.mum.cs.cs425.lesson15.tddusingstubsnmocks;

import java.util.Arrays;
import java.util.stream.Stream;

import edu.mum.cs.cs425.lesson15.tddusingstubsnmocks.service.ISquaresComputingService;

public class SumOfSquaresComputer {
	
	private ISquaresComputingService sqCompService;
	
	public SumOfSquaresComputer(ISquaresComputingService sqCompService) {
		this.sqCompService = sqCompService;
	}
	
	public int computeSumOfSquares(int[] ints) {
		int[] sqrs = sqCompService.computesSquares(ints);
	//	int[] sqrs = {1,4,9};
//		int sum = 0;
//		for (int i : sqrs) {
//			sum += i;
//		}
//		return sum;
		return Arrays.stream(sqrs).sum();
	}

}
