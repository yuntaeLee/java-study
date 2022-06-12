package org.oop.datastructure;

public class RecursionFactorial {
	
	public static int factorial_iter(int n) {
		int result = 1;
		
		for( int i = 1; i < n+1; i++) {
			result *= i;
		}
		
		return result;
	}
	
	public static int factorial_rec(int n) {
		int result = 1;
		
		if( n == 1) return 1;
		
		return result = n * factorial_rec(n-1);
		
		// n * (n-1)!
		
	}

	public static void main(String[] args) {

		System.out.println(factorial_iter(5));
		System.out.println(factorial_rec(5));
	}

}
