package org.oop.recursion;

public class TowerOfHanoi {

	public static void hanoi(int n, int start, int end, int sub) {
		
		if( n == 0 ) {
			return;
		}
		
		hanoi(n-1, start, sub, end);
		if( end == 3 ) {
			System.out.printf("��� %d�� ������ ��� %d���� �ű��.\n", start, end);
		} else {
			System.out.printf("��� %d�� ������ ��� %d�� �ű��.\n", start, end);
		}
		
		hanoi(n-1, sub, end, start);
	}
	
	public static void main(String[] args) {
		System.out.println("60161069 ������");
		hanoi(3, 1, 3, 2);
	}

}
