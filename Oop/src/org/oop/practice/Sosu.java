package org.oop.practice;

import java.util.Scanner;

public class Sosu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int count = 0;
		for(int i = 1; i < n+1; i++ ) {
			if ( n % i == 0) {
				count++;
			}
		}
		if( count == 2 ) {
			System.out.println("�Ҽ� �Դϴ�.");
		} else {
			System.out.println("�Ҽ��� �ƴϴ�.");
		}
	}

}
