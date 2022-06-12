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
		System.out.println("60161069 이윤태");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오.");
		int n = sc.nextInt();
		sc.close();
		countDown(n);
	}
}
