package org.oop.sort;

public class MergeSort {
	public static void mergeSort(int[] arr) {
		// 임시 저장 배열
		int[] temp = new int[arr.length];
		mergeSort(arr, temp, 0, arr.length-1);
	}
	
	private static void mergeSort(int[] arr, int[] temp, int start, int end) {
		// 끝이 시작보다 작아지면 종료
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, temp, start, mid);
			mergeSort(arr, temp, mid+1, end);
			
			// 재귀함수가 돌아왔을 때 가운데를 기준으로 왼쪽과 오른쪽이 정렬된 상태	
			merge(arr, temp, start, mid, end); // 나눠진 두 방을 병합
			
		}
	}
	
	// 나눠진 두개의 방을 결합
	private static void merge(int[] arr, int[] temp, int start, int mid, int end) {
		// 임시 배열에 복사
		for (int i = start; i <= end; i++) {
			temp[i] = arr[i];
		}
		
		int part1 = start; // 첫번째 배열의 첫번째 인덱스
		int part2 = mid + 1; // 두번째 배열의 첫번째 인덱스
		int index = start; // 결과 배열의 인덱스
		
		// 첫번째 배열이 중간까지 가고, 두번째 배열이 끝까지 갈 동안 반복
		while (part1 <= mid && part2 <= end) {
			// 첫뻔째 배열의 값이 작으면 기존 배열로 값을 옴기고 포인터를 증가
			if (temp[part1] <= temp[part2] ) {
				arr[index] = temp[part1];
				part1++;
			// 첫번째 배열의 값이 크면 두번째 배열에서 값을 옮기고, 두번째 포인터 증가
			} else {
				arr[index] = temp[part2];
				part2++;
			}
			index++; // 결과값이 저장되었기 때문에 증가시킴
		}
		// 두번째 배열은 비었고, 앞쪽배열의 값이 남아있을 경우, 남은 만큼 최종배열에 저장
		// 두번째 배열은 최종 배열에 뒤쪽에 이미 있기 때문에 상관없음
		for (int i = 0; i <= mid - part1; i++) {
			arr[index + i] = temp[part1 + i];
		}
	}
	
	private static void printArray(int[] arr) {
		System.out.println("60161069 이윤태");
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
