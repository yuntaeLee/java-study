package org.oop.datastructure.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopInputNumber {

	private void getMinNumber(ArrayList<Integer> aList) {
		int min = aList.get(0);
		
		for(int i=1; i < aList.size(); i++) {
			if( min < aList.get(i)) {
				min = aList.get(i);
			}
		}
		System.out.println("�ּҰ�: " + min);
	}
	
	private void getMaxNumber(ArrayList<Integer> aList) {
		int max = aList.get(0);
		
		for(int i=1; i < aList.size(); i++) {
			if( max > aList.get(i)) {
				max = aList.get(i);
			}
		}
		System.out.println("�ִ밪: " + max);
	}
	
	public void play() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> aList = new ArrayList<>();
		
		System.out.println("���ڸ� �Է��ϼ���.");
		int n = sc.nextInt();
		
		while(n != 0) {
			aList.add(n);
			n = sc.nextInt();
		}
		
		getMinNumber(aList);
		getMaxNumber(aList);
	}
	
	public static void main(String[] args) {
		System.out.println("60160169 ������");
		LoopInputNumber n = new LoopInputNumber();
		n.play();
		
	}

}
