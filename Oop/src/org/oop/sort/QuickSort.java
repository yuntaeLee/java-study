package org.oop.sort;

public class QuickSort {

	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	
	private static void quickSort(int[] arr, int start, int end) {
		
		int part2 = partition(arr, start, end); // 나눈 파티션의 오른쪽 방 첫번째 값
		
		// 오른쪽 파티션의 시작점 바로뒤라면 왼쪽 파티션의 값이 하나이기 때문에 정렬할 필요x
		// 오른쪽 파티션이 시작점에서 한개 이상 차이날 경우
		if (start < part2 - 1) {
			quickSort(arr, start, part2 - 1); 
		}
		// 오른쪽 파티션의 시작점이 마지막 배열방보다 작은 경우
		if  (part2 < end) {
			quickSort(arr, part2, end);
		}
	}
	
	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start + end) / 2];
		// 시작점이 끝 지점보다 작은 경우 까지 반복
		while (start < end) {
			// 배열 방의 값이 피벗값보다 작으면 한칸씩 앞으로
			while (arr[start] < pivot) start++;
			// 배열 방의 값이 피벗값보다 크면 한칸씩 뒤로
			while (arr[end] > pivot) end--;
			// 시작점과 끝점이 만났거나 지나쳤는지 확인
			if (start <= end) {
				swap (arr, start, end);
				start++;
				end--;
			}
		}
		return start;
	}
	
	private static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	public static void printArray(int[] arr) {
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}
	
//	public void sort(int[] arr, int begin, int end) {
//		if (begin < end) {
//	        int partitionIndex = partition(arr, begin, end);
//
//	        sort(arr, begin, partitionIndex-1);
//	        sort(arr, partitionIndex+1, end);
//	    }
//		
//	}
//	
//	public int partition(int arr[], int begin, int end) {
//	    int pivot = arr[end];
//	    int i = (begin-1);
//
//	    for (int j = begin; j < end; j++) {
//	        if (arr[j] <= pivot) {
//	            i++;
//
//	            int swapTemp = arr[i];
//	            arr[i] = arr[j];
//	            arr[j] = swapTemp;
//	        }
//	    }
//
//	    int swapTemp = arr[i+1];
//	    arr[i+1] = arr[end];
//	    arr[end] = swapTemp;
//
//	    return i+1;
//	}
	
	public static void main(String[] args) {
		int[] arr = {5, 1, 3, 9, 6, 2, 4, 7, 8};
		quickSort(arr);
		printArray(arr);
		
	}

}
