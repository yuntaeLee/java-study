package org.oop.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BonusHomework {
	
	public void SearchMaxNumber(ArrayList<Integer> ar) {
		System.out.print("�ִ�: " + Collections.max(ar));
	}
	
	public void SearchMinNumber(ArrayList<Integer> ar) {
		System.out.println(" �ּ�: " + Collections.min(ar));
	}
	
	public void SortArray(ArrayList<Integer> ar) {
		System.out.print("����: ");
		Collections.sort(ar);
		for( int i : ar ) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println("60161069 ������");
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<>();
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		int n = sc.nextInt();
		
		while( n != 0 && ar.size() < 9) {
			ar.add(n);
			n = sc.nextInt();
		}
		sc.close();
		BonusHomework bh = new BonusHomework();
		bh.SearchMaxNumber(ar);
		bh.SearchMinNumber(ar);
		bh.SortArray(ar);
	}
}
