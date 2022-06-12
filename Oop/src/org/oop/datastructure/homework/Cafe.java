package org.oop.datastructure.homework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cafe {
	
	public void Order() {
		Scanner sc = new Scanner(System.in);

		Queue<String> orderList = new LinkedList<>();
		
		while(true) {
			System.out.println("주문은 1, 완료는 2, 종료는 0");
			int n = sc.nextInt();
			
			if ( n == 0 ) {
				System.out.println("종료");
				return;
			}
			else if ( n == 1 ) {
				System.out.print("주문하실 음료는? ");
				orderList.offer(sc.next());
				System.out.println("준비중 " + orderList.size() + "개");
			}
			else if ( n == 2 ) {
				String menu = orderList.poll();
				if ( menu == null ) {
					System.out.println("주문 내역이 존재하지 않습니다.");
				}
				else {
					System.out.println(menu + "나왔습니다.");
					System.out.println("준비중 " + orderList.size() + "개");
				}
			}
			else {
				System.out.println("숫자를 잘못 입력하셨습니다.");
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("60161069 이윤태");
		Cafe cafe = new Cafe();
		cafe.Order();
	}

}
