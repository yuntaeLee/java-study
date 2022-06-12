package org.oop.object;

import java.util.Scanner;

public class Calculator {

	private int a;
	private int b;
	
	Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int sum() {
		return a + b;
	}
	
	int sub() {
		return a - b;
	}
	
	int mul() {
		return a * b;
	}
	
	float div() {
		return a / b;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수를 입력하시오.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Calculator cal = new Calculator(a, b);
		System.out.println("두 수의 합은? " + cal.sum());
		System.out.println("두 수의 차은? " + cal.sub());
		System.out.println("두 수의 곱은? " + cal.mul());
		System.out.println("두 수의 나눗셈은? " + cal.div());
		
	}

}
