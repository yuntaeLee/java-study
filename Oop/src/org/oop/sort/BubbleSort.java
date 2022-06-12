package org.oop.sort;

public class BubbleSort {
	
	public static void print_arr(int[] arr) {
		for(int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	public static void sort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-1-i; j++) {
				if( arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					print_arr(arr);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {5, 1, 3, 9, 6, 2, 4, 7, 8};
		print_arr(arr);
		sort(arr);
		
	}

}
