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
		System.out.println("�� ������ �Է��Ͻÿ�.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Calculator cal = new Calculator(a, b);
		System.out.println("�� ���� ����? " + cal.sum());
		System.out.println("�� ���� ����? " + cal.sub());
		System.out.println("�� ���� ����? " + cal.mul());
		System.out.println("�� ���� ��������? " + cal.div());
		
	}

}
