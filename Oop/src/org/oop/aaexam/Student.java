package org.oop.aaexam;

import java.util.Scanner;

public class Student extends Human {
	
	private String std_no;
	
	public Student() {
		super();
		this.std_no = "60201234";
	}
	
	public Student(String n, int b, boolean m, String std_no) {
		super(n, b, m);
		this.std_no = std_no;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.printf(", ÇÐ¹ø: %s", std_no);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student(sc.next(), sc.nextInt(), sc.nextBoolean(), sc.next());
		s1.showInfo();
	}

}
