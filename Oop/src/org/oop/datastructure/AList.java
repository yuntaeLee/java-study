package org.oop.datastructure;

import java.util.ArrayList;

public class AList {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(5);
		arrayList.add(8);
		System.out.println("ũ���: " + arrayList.size());
		
		for(int i=0; i<arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}
		System.out.println();
		
		arrayList.remove(1); // �ε��� ����
		if(arrayList.contains(8)) System.out.println("8 ����");
		else System.out.println("8 ����");
		
	}

}
