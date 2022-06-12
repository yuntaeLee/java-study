package org.oop.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BonusHomework {
	
	public void SearchMaxNumber(ArrayList<Integer> ar) {
		System.out.print("최대: " + Collections.max(ar));
	}
	
	public void SearchMinNumber(ArrayList<Integer> ar) {
		System.out.println(" 최소: " + Collections.min(ar));
	}
	
	public void SortArray(ArrayList<Integer> ar) {
		System.out.print("정렬: ");
		Collections.sort(ar);
		for( int i : ar ) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println("60161069 이윤태");
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<>();
		System.out.println("숫자를 입력하시오.");
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
