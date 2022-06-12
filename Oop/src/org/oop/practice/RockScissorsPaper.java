package org.oop.practice;

import java.util.Scanner;

public class RockScissorsPaper {

	String computer = "";
	
	public void ChoiceComputer() {
		int temp = (int)(Math.random()*3)+1;
		switch( temp ) {
			case 1: computer = "가위";
				return;
			case 2: computer = "바위";
				return;
			case 3: computer = "보";
				return;
		}
	}
	
	public void PlayGame(String s) {
		if ( s.equals("가위") ) {
			System.out.println("컴퓨터: " + computer);
			
			if ( computer.equals("바위") ) System.out.println("패배");
			else if ( computer.equals("보") ) System.out.println("승리");
			else System.out.println("무승부");
			
			
		} else if( s.equals("바위")) {
			System.out.println("컴퓨터: " + computer);
			
			if ( computer.equals("보") ) System.out.println("패배");
			else if( computer.equals("가위") ) System.out.println("승리");
			else System.out.println("무승부");
				
		} else if( s.equals("보") ) {
			System.out.println("컴퓨터: " + computer);
			
			if( computer.equals("가위") ) System.out.println("패배");
			else if( computer.equals("바위") ) System.out.println("승리");
			else System.out.println("무승부");
			
		} else {
			System.out.println("잘 못 입력하셨습니다.");
		}
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		RockScissorsPaper rsp = new RockScissorsPaper();
		
		rsp.ChoiceComputer();
		
		System.out.println("가위 바위 보 중 하나를 입력해주세요.");
		String s = sc.next();
		System.out.println("플레이어: " + s);
		rsp.PlayGame(s);
		
		sc.close();
	}

}
