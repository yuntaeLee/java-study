package org.oop.practice;

import java.util.Scanner;

public class WhatCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for( int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("���ڸ� �Է��Ͻÿ�.");
		int n = sc.nextInt();
		String s = "";
		for( int i = 0; i < arr.length; i++) {
			if( arr[i] == n ) {
				s = (i+1)+"��°";
				break;
			} else {
				s = "�������� �ʽ��ϴ�.";
			}
		}
		System.out.println(s);
	}

}
