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
			System.out.println("�迭 ���� �ʰ�");
		}
		
		
		System.out.println("���α׷� ����");
	}

}
