package org.oop.practice;

public class Number52 {

	public static void main(String[] args) {
		
		int num = 15;
		
		for( int i = 0; i < 5; i++) {
			for( int j = 0; j < 5; j++) {
				if( i >= j+1 ) {
					System.out.printf("%3s", " ");
				} else {
					System.out.printf("%3d", num);
					num--;
				}
			}
			System.out.println();
		}	
	}
}
