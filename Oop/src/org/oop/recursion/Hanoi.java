package org.oop.recursion;

public class Hanoi {
	public static void hanoi(int n, int from, int to, int by) {
		if( n == 0 ) return;
		else {
			hanoi(n-1, from, by, to); // ���� ���뿡�� ���� ����� n-1�� �ű��
			System.out.println(from + "- > " + to); // ���� ���뿡�� ��ǥ ����� 1�� �ű��
			hanoi(n-1, by, to, from); // ���� ���뿡�� ��ǥ ����� n-1�� �ű��
		}
	}
 
	public static void main(String[] args) {

		hanoi(3, 1, 3, 2);
	}

}
