package org.oop.aaexam;

public class Number1 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int n = 25;
		for( int i = 0; i < 5; i++) {
			for( int j = 0; j < 5; j++) {
				arr[i][j] = n;
				n--;
			}
		}

		for( int i = 0; i < 5; i++) {
			for( int j = 0; j < 5; j++) {
				System.out.printf("%-4d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
