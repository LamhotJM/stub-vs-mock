package edu.mum.cs.cs425.lesson15.tddwithjunit;


public class FibonacciGenerator {

	/**
	 * Generates the first n elements of the fibonacci sequence
	 * beginning with the given a and b.
	 * @param a the first element
	 * @param b the given second element
	 * @param n the length of the sequence to generate
	 * @return a string containing the sequence of first N fibonacci numbers
	 */
	public String generateFirstNFiboSequence(int a, int b, int n) {
		String s = "";
		if (n == 1) return s + a;
		if (n == 2) return s + a + ", " + b;
		if (n > 2) {
			s = a + ", " + b;
			while (n > 2) {
				int nextFibo = a + b;
				a = b;
				b = nextFibo;
				s += ", " + nextFibo;
				--n;
			}
		}
		return s;
	}
	
}
