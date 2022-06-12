package org.oop.practice;

public class Number511 {

	public static void main(String[] args) {

		int x=0;
		int y=0;
		for( int i = 5; i > 0; i--) {
			x++;
			y=0;
			for( int j = 0; j < 5; j++) {
				y--;
				if ( i <= j ) {
					System.out.print((i*2-1)+x+y+" ");
				}
				else System.out.print(j+x+" ");
			}
			System.out.println();
		}
	}
}
