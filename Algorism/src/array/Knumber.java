package array;

import java.util.Arrays;

public class Knumber {
	
	public int[] getSlice(int[] arr, int start, int end) {
		
		int[] sliceArr = new int[end - start + 1];
		
		for( int i = 0; i < sliceArr.length; i++) {
			sliceArr[i] = arr[start + i];
		}
		 return sliceArr;
	}
	
	public int[] bubbleSort(int arr[]) {
		
		for( int i = 0; i< arr.length; i++) {
			for( int j = 0; j < arr.length-i-1; j++) {
				
				if( arr[j] > arr[j+1] ) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public int solution(int[] arr, int i, int j, int k) {
		
		int[] newArr = getSlice(arr, i-1, j-1);
		
		newArr = bubbleSort(newArr);
		
		return newArr[k-1];
	}
	public static void main(String[] args) {
		
		Knumber k = new Knumber();
		int[] arr = { 1, 5, 2, 6, 3, 7, 4 };
		System.out.println(k.solution(arr, 2, 5, 3));
	}

}
