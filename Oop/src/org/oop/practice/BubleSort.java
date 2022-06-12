package org.oop.practice;

public class BubleSort {

	public static void main(String[] args) {
		
		int[] arr = new int[] {42, 36, 2, 1, 713, 432, 64, 12};
		
		for( int i = 0; i< arr.length; i++) {
			for( int j = 0; j < arr.length-i-1; j++) {
				if( arr[j] < arr[j+1] ) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
