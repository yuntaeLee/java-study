package org.oop.recursion;

import java.util.Scanner;

public class CountDown {

	public static void countDown(int n) {
		if ( n == 0 ) {
			System.out.println("Boom");
			return;
		}
		
		System.out.println(n);
		countDown(--n);
	}
	
	public static void main(String[] args) {
		System.out.println("60161069 ������");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�.");
		int n = sc.nextInt();
		sc.close();
		countDown(n);
	}
}
