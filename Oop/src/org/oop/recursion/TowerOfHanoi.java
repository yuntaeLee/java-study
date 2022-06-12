package org.oop.recursion;

public class TowerOfHanoi {

	public static void hanoi(int n, int start, int end, int sub) {
		
		if( n == 0 ) {
			return;
		}
		
		hanoi(n-1, start, sub, end);
		if( end == 3 ) {
			System.out.printf("기둥 %d의 원반을 기둥 %d으로 옮긴다.\n", start, end);
		} else {
			System.out.printf("기둥 %d의 원반을 기둥 %d로 옮긴다.\n", start, end);
		}
		
		hanoi(n-1, sub, end, start);
	}
	
	public static void main(String[] args) {
		System.out.println("60161069 이윤태");
		hanoi(3, 1, 3, 2);
	}

}
