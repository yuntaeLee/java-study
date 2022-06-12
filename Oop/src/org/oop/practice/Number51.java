package org.oop.practice;

public class Number51 {

	public static void main(String[] args) {

//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				int a = i+j+1;
//				if (a > 5) {
//					
//				}
//				System.out.printf("%3d", a);
//			}
//			System.out.println();
//		}
		
		int i, j, N;
		int k = 1;
		
		for(i=1; i<=5; i++) {
			for(j=i; j<=5; j++) {
				System.out.printf("%3d", j);
			}
			
			k = j-2;
			for(j=1; j<i; j++, k--) {
				System.out.printf("%3d", k);
			}
			System.out.println();
		}
		
	}

}
