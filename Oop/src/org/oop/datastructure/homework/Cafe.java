package org.oop.datastructure.homework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cafe {
	
	public void Order() {
		Scanner sc = new Scanner(System.in);

		Queue<String> orderList = new LinkedList<>();
		
		while(true) {
			System.out.println("�ֹ��� 1, �Ϸ�� 2, ����� 0");
			int n = sc.nextInt();
			
			if ( n == 0 ) {
				System.out.println("����");
				return;
			}
			else if ( n == 1 ) {
				System.out.print("�ֹ��Ͻ� �����? ");
				orderList.offer(sc.next());
				System.out.println("�غ��� " + orderList.size() + "��");
			}
			else if ( n == 2 ) {
				String menu = orderList.poll();
				if ( menu == null ) {
					System.out.println("�ֹ� ������ �������� �ʽ��ϴ�.");
				}
				else {
					System.out.println(menu + "���Խ��ϴ�.");
					System.out.println("�غ��� " + orderList.size() + "��");
				}
			}
			else {
				System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("60161069 ������");
		Cafe cafe = new Cafe();
		cafe.Order();
	}

}
