package org.oop.practice;

public class Number5 {

	public static void main(String[] args) {

		int num = 15;
		
		for(int i=0; i<5; i++) {
			for(int j=i; j<5; j++) {
				System.out.printf("%3d", num);
				num-=1;
			}
			System.out.println();
		}
	}

}
