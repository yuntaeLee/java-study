package org.oop.sort;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		int i, j, temp;
		
		for(i = 1; i < arr.length; i++) {
			temp = arr[i];
			for(j = i-1; j >= 0 && arr[j] > temp; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
		print(arr);
	}
	
	private static void print(int[] arr) {
		System.out.println("60161069 ¿Ã¿±≈¬");
		for(int n : arr) {
			System.out.print(n + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 1, 3, 9, 6, 2, 4, 7, 8};
		insertionSort(arr);
		
	}
}
