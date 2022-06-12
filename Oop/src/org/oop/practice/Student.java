package org.oop.practice;

import java.util.Scanner;

public class Student {
	
	private int StudentNo;
	private String Name;
	private boolean registered;
	
	public Student(int stdNo, String n) {
		this.StudentNo = stdNo;
		this.Name = n;
		this.registered = true;
	}
	
	public void showInfo() {
		System.out.printf("학번 %d 이름 %s 등록여부 %b", StudentNo, Name, registered);
	}
	
	public void register() {
		if( registered ) {
			System.out.println("이미 등록되어 있습니다.");
		} else {
			this.registered = true;
			System.out.println("등록 되었습니다.");
		}
	}
	
	public void leave() {
		if ( registered ) {
			registered = false;
			System.out.println("휴학 처리 되었습니다.");
		} else {
			System.out.println("이미 휴학 중입니다.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student(sc.nextInt(), sc.next());
		sc.close();
		
		s.register();
		s.leave();
		s.leave();
		s.register();
		s.showInfo();
	}

}
