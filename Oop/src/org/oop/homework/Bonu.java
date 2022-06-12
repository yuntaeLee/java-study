package org.oop.homework;

import java.util.Scanner;

class Bon {
	int arr_length = 0;
	// 배열 생성
	public int[] createArr() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		while( arr_length  < 10 ) {
			int n = sc.nextInt();
			arr[arr_length] = n;
			if( n == 0 ) {
				sc.close();
				return arr;
			}
			arr_length++;
		}
		sc.close();
		return arr;
	}
}

public class Bonu {
	public static void main(String[] args) {
		
		System.out.println("60161069 이윤태");
		Bon b = new Bon();
		int[] arr = b.createArr();
		
		for( int i = 0; i<b.arr_length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
