package org.oop.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
	int[] lottoNumber = new int[6];
	int[] myNumber = new int[6];
	
	public int[] createLottoNumber() {
		// 번호 생성
		for( int i = 0; i < lottoNumber.length; i++ ) {
			lottoNumber[i] = (int)(Math.random()*10)+1;
			
			// 중복 처리
			for( int j = 0; j < i; j++ ) {
				if( lottoNumber[i] == lottoNumber[j]) {
					i--;
				}
				
				// 오름차순 정렬
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
		System.out.println("1에서 45 사이 여섯개의 번호를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		
		for( int i = 0; i < myNumber.length; i++) {
			myNumber[i] = sc.nextInt();
			
			for( int j = 0; j < i; j++) {
				if (myNumber[i] == myNumber[j] || myNumber[i] < 0 || myNumber[i] >45 ) {
					System.out.println("잘 못 입력하셨습니다.");
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
			System.out.println("꽝");
		} else {
			System.out.printf("%d개 - %d등", count, 7-count);	
		}
	}
	

	public static void main(String[] args) {

		int[] lotto_number = new int[6];
		int[] my_number = new int[6];
		Lotto lt = new Lotto();
		
		lotto_number = lt.createLottoNumber();
//		my_number = lt.create_my_number();
		
		System.out.println("로또 번호: " + Arrays.toString(lotto_number));
//		System.out.println("입력 번호: " + Arrays.toString(my_number));
//		lt.compare_lotto();
	}

}
