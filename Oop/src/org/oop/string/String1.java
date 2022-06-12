package org.oop.string;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {

		// 자바는 유니코드를 사용하므로 char당 2byte 사용. 
		String s = "abcdefghijklmnopqrstuvwxyz";
		
		for( int i = 0; i < s.length(); i+=2) {
			System.out.print(s.charAt(i));	
		}
		
		Scanner sc = new Scanner(System.in);
		String s1 = "자바";
		System.out.println(s1 = s1 + sc.next());
		System.out.println(s1.concat(sc.next()));
		
		String s2 = "자바";
		Scanner scn = new Scanner(System.in);
		System.out.println(s2 + scn.next());
		sc.close();
		scn.close();
		
	}
}
