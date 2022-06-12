package org.oop.recursion;

public class Nsquared {
	
	public static int recursionF(int x, int n) {
		
		if ( n == 0 ) return 1;
		
		return x * recursionF(x, n-1);
	}
	
	public static void main(String[] args) {
		System.out.println("60161069 юлю╠еб");
		int x=2, n=10;
		System.out.println(recursionF(x, n));
	}
}
