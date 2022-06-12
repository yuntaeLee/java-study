package org.oop.sort;

public class SelectionSort {
	
	public static void sort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				int min = arr[i];
				if( min > arr[j]) {
					min = arr[j];
					arr[j] = arr[i];
					arr[i] = min;
				}
			}	
		}
		for( int n : arr) {
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = {5, 1, 3, 9, 6, 2, 4, 7, 8};
		sort(arr);
	}

}
