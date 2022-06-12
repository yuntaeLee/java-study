package org.oop.practice;

import java.util.Arrays;

public class PlusArray {

	public static void main(String[] args) {

		int[] a = new int[] {1, 2, 3, 4, 5};
		int[] b = new int[] {0, 1, 2, 3, 4};
		int[] result = new int[5];
		
		for( int i=0; i<a.length; i++ ) {
			result[i] = a[i] + b[i];
		}
		
		System.out.println(Arrays.toString(result));
	}

}
