package org.oop.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
	int[] lottoNumber = new int[6];
	int[] myNumber = new int[6];
	
	public int[] createLottoNumber() {
		// ��ȣ ����
		for( int i = 0; i < lottoNumber.length; i++ ) {
			lottoNumber[i] = (int)(Math.random()*10)+1;
			
			// �ߺ� ó��
			for( int j = 0; j < i; j++ ) {
				if( lottoNumber[i] == lottoNumber[j]) {
					i--;
				}
				
				// �������� ����
				if( lottoNumber[i] < lottoNumber[j] ) {
					int temp = lottoNumber[i];
					lottoNumber[i] = lottoNumber[j];
					lottoNumber[j] = temp;
				}
			}
		}
		return lottoNumber;
	}
	
	public int[] create_my_number() {
		System.out.println("1���� 45 ���� �������� ��ȣ�� �Է����ּ���.");
		Scanner sc = new Scanner(System.in);
		
		for( int i = 0; i < myNumber.length; i++) {
			myNumber[i] = sc.nextInt();
			
			for( int j = 0; j < i; j++) {
				if (myNumber[i] == myNumber[j] || myNumber[i] < 0 || myNumber[i] >45 ) {
					System.out.println("�� �� �Է��ϼ̽��ϴ�.");
					i--;
				}
				if( myNumber[j] > myNumber[j+1] ) {
					int temp = myNumber[j+1];
					myNumber[j+1] = myNumber[j];
					myNumber[j] = temp;
				}
			}
		}
		return myNumber;
	}
	
	public void compare_lotto() {
		int count = 0;
		for( int i = 0; i < 6; i++) {
			for( int j = 0; j < 6; j++) {
				if ( lottoNumber[i] == myNumber[j]) {
					count++;
				}
			}
		}
		if( count == 0 ) {
			System.out.println("��");
		} else {
			System.out.printf("%d�� - %d��", count, 7-count);	
		}
	}
	

	public static void main(String[] args) {

		int[] lotto_number = new int[6];
		int[] my_number = new int[6];
		Lotto lt = new Lotto();
		
		lotto_number = lt.createLottoNumber();
//		my_number = lt.create_my_number();
		
		System.out.println("�ζ� ��ȣ: " + Arrays.toString(lotto_number));
//		System.out.println("�Է� ��ȣ: " + Arrays.toString(my_number));
//		lt.compare_lotto();
	}

}
