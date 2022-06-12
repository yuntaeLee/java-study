package org.oop.sort;

public class MergeSort {
	public static void mergeSort(int[] arr) {
		// �ӽ� ���� �迭
		int[] temp = new int[arr.length];
		mergeSort(arr, temp, 0, arr.length-1);
	}
	
	private static void mergeSort(int[] arr, int[] temp, int start, int end) {
		// ���� ���ۺ��� �۾����� ����
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, temp, start, mid);
			mergeSort(arr, temp, mid+1, end);
			
			// ����Լ��� ���ƿ��� �� ����� �������� ���ʰ� �������� ���ĵ� ����	
			merge(arr, temp, start, mid, end); // ������ �� ���� ����
			
		}
	}
	
	// ������ �ΰ��� ���� ����
	private static void merge(int[] arr, int[] temp, int start, int mid, int end) {
		// �ӽ� �迭�� ����
		for (int i = start; i <= end; i++) {
			temp[i] = arr[i];
		}
		
		int part1 = start; // ù��° �迭�� ù��° �ε���
		int part2 = mid + 1; // �ι�° �迭�� ù��° �ε���
		int index = start; // ��� �迭�� �ε���
		
		// ù��° �迭�� �߰����� ����, �ι�° �迭�� ������ �� ���� �ݺ�
		while (part1 <= mid && part2 <= end) {
			// ù��° �迭�� ���� ������ ���� �迭�� ���� �ȱ�� �����͸� ����
			if (temp[part1] <= temp[part2] ) {
				arr[index] = temp[part1];
				part1++;
			// ù��° �迭�� ���� ũ�� �ι�° �迭���� ���� �ű��, �ι�° ������ ����
			} else {
				arr[index] = temp[part2];
				part2++;
			}
			index++; // ������� ����Ǿ��� ������ ������Ŵ
		}
		// �ι�° �迭�� �����, ���ʹ迭�� ���� �������� ���, ���� ��ŭ �����迭�� ����
		// �ι�° �迭�� ���� �迭�� ���ʿ� �̹� �ֱ� ������ �������
		for (int i = 0; i <= mid - part1; i++) {
			arr[index + i] = temp[part1 + i];
		}
	}
	
	private static void printArray(int[] arr) {
		System.out.println("60161069 ������");
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}
	

	public static void main(String[] args) {
		int[] arr = {5, 1, 3, 9, 6, 2, 4, 7, 8};
		mergeSort(arr);
		printArray(arr);
		
	}

}
