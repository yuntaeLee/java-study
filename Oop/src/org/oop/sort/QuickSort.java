package org.oop.sort;

public class QuickSort {

	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	
	private static void quickSort(int[] arr, int start, int end) {
		
		int part2 = partition(arr, start, end); // ���� ��Ƽ���� ������ �� ù��° ��
		
		// ������ ��Ƽ���� ������ �ٷεڶ�� ���� ��Ƽ���� ���� �ϳ��̱� ������ ������ �ʿ�x
		// ������ ��Ƽ���� ���������� �Ѱ� �̻� ���̳� ���
		if (start < part2 - 1) {
			quickSort(arr, start, part2 - 1); 
		}
		// ������ ��Ƽ���� �������� ������ �迭�溸�� ���� ���
		if  (part2 < end) {
			quickSort(arr, part2, end);
		}
	}
	
	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start + end) / 2];
		// �������� �� �������� ���� ��� ���� �ݺ�
		while (start < end) {
			// �迭 ���� ���� �ǹ������� ������ ��ĭ�� ������
			while (arr[start] < pivot) start++;
			// �迭 ���� ���� �ǹ������� ũ�� ��ĭ�� �ڷ�
			while (arr[end] > pivot) end--;
			// �������� ������ �����ų� �����ƴ��� Ȯ��
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
