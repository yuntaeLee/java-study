package org.oop.datastructure;

import java.util.ArrayList;

public class AList {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(5);
		arrayList.add(8);
		System.out.println("크기는: " + arrayList.size());
		
		for(int i=0; i<arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}
		System.out.println();
		
		arrayList.remove(1); // 인덱스 제거
		if(arrayList.contains(8)) System.out.println("8 있음");
		else System.out.println("8 없음");
		
	}

}
