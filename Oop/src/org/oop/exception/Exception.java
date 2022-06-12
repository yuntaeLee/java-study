package org.oop.exception;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요\n나눈 몫을 알려드립니다.");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			System.out.println(a/b);
		} catch (ArithmeticException err) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		System.out.println("프로그램 종료");
	}

}
