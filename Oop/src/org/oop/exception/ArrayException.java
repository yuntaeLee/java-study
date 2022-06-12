package org.oop.exception;

public class ArrayException {
	
	public static void main(String[] args) {
		
		int c[] = new int[5];
		
		try {
			for( int i = 0; i < 10; ++i) {
				System.out.println(i);
				c[i] = i;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 초과");
		}
		
		
		System.out.println("프로그램 종료");
	}

}
