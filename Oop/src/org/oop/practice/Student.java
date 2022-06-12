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
		System.out.printf("�й� %d �̸� %s ��Ͽ��� %b", StudentNo, Name, registered);
	}
	
	public void register() {
		if( registered ) {
			System.out.println("�̹� ��ϵǾ� �ֽ��ϴ�.");
		} else {
			this.registered = true;
			System.out.println("��� �Ǿ����ϴ�.");
		}
	}
	
	public void leave() {
		if ( registered ) {
			registered = false;
			System.out.println("���� ó�� �Ǿ����ϴ�.");
		} else {
			System.out.println("�̹� ���� ���Դϴ�.");
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
