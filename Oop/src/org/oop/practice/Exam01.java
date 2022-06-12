package org.oop.practice;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean is_True = sc.nextBoolean();
		
		if(is_True) {
			System.out.println("TRUE를 입력");
		} else {
			System.out.println("FALSE를 입력");
		}
	}

}