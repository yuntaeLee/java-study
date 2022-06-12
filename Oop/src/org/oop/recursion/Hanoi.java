package org.oop.recursion;

public class Hanoi {
	public static void hanoi(int n, int from, int to, int by) {
		if( n == 0 ) return;
		else {
			hanoi(n-1, from, by, to); // 시작 막대에서 경유 막대로 n-1개 옮기기
			System.out.println(from + "- > " + to); // 시작 막대에서 목표 막대로 1개 옮기기
			hanoi(n-1, by, to, from); // 경유 막대에서 목표 막대로 n-1개 옮기기
		}
	}
 
	public static void main(String[] args) {

		hanoi(3, 1, 3, 2);
	}

}
