package org.oop.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class BonusList {
	
	public static int a, max, min;
	
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		
		for(int i=0; i<10; i++) {
			a = sc.nextInt();
			if(a != 0) list.add(a);
			else break;
		}
		
		int[] array = new int[list.size()];
		for( int i=0; i<array.length; i++) {
			array[i] = list.get(i);
		}
		
		max = array[0];
		for( int i=0; i<array.length; i++) {
			if( max < array[i]) {
				max = array[i];
			}
		}
		
		min = array[0];
		for( int i=0; i<array.length; i++) {
			if( min > array[i]) {
				min = array[i];
			}
		}
		
		System.out.println("최대: " + max + " 최소: " + min);
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length - i - 1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for (int i : array) {
			System.out.print(i + " ");
		}
		
	}

}
