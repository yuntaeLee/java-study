package org.oop.practice;

import java.util.Scanner;

public class RockScissorsPaper {

	String computer = "";
	
	public void ChoiceComputer() {
		int temp = (int)(Math.random()*3)+1;
		switch( temp ) {
			case 1: computer = "����";
				return;
			case 2: computer = "����";
				return;
			case 3: computer = "��";
				return;
		}
	}
	
	public void PlayGame(String s) {
		if ( s.equals("����") ) {
			System.out.println("��ǻ��: " + computer);
			
			if ( computer.equals("����") ) System.out.println("�й�");
			else if ( computer.equals("��") ) System.out.println("�¸�");
			else System.out.println("���º�");
			
			
		} else if( s.equals("����")) {
			System.out.println("��ǻ��: " + computer);
			
			if ( computer.equals("��") ) System.out.println("�й�");
			else if( computer.equals("����") ) System.out.println("�¸�");
			else System.out.println("���º�");
				
		} else if( s.equals("��") ) {
			System.out.println("��ǻ��: " + computer);
			
			if( computer.equals("����") ) System.out.println("�й�");
			else if( computer.equals("����") ) System.out.println("�¸�");
			else System.out.println("���º�");
			
		} else {
			System.out.println("�� �� �Է��ϼ̽��ϴ�.");
		}
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		RockScissorsPaper rsp = new RockScissorsPaper();
		
		rsp.ChoiceComputer();
		
		System.out.println("���� ���� �� �� �ϳ��� �Է����ּ���.");
		String s = sc.next();
		System.out.println("�÷��̾�: " + s);
		rsp.PlayGame(s);
		
		sc.close();
	}

}
