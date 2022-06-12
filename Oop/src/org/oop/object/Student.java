package org.oop.object;

import java.util.Scanner;

public class Student {

	// 멤버변수
	private int scoreKor;
	private int scoreEng;
	
	Student(int scoreKor, int scoreEng) {
		this.scoreKor = scoreKor;
		this.scoreEng = scoreEng;
	}
	
	// 메소드
	public int sum() {
		return scoreKor + scoreEng;
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int scoreKor = sc.nextInt();
		int scoreEng = sc.nextInt();
		sc.close();
		Student a = new Student(scoreKor, scoreEng);
		System.out.println(a.sum());
	}
}
