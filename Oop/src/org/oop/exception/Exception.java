package org.oop.exception;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���\n���� ���� �˷��帳�ϴ�.");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			System.out.println(a/b);
		} catch (ArithmeticException err) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		System.out.println("���α׷� ����");
	}

}
