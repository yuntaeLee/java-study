package org.oop.string;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {

		// �ڹٴ� �����ڵ带 ����ϹǷ� char�� 2byte ���. 
		String s = "abcdefghijklmnopqrstuvwxyz";
		
		for( int i = 0; i < s.length(); i+=2) {
			System.out.print(s.charAt(i));	
		}
		
		Scanner sc = new Scanner(System.in);
		String s1 = "�ڹ�";
		System.out.println(s1 = s1 + sc.next());
		System.out.println(s1.concat(sc.next()));
		
		String s2 = "�ڹ�";
		Scanner scn = new Scanner(System.in);
		System.out.println(s2 + scn.next());
		sc.close();
		scn.close();
		
	}
}
