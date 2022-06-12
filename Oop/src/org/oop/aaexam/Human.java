package org.oop.aaexam;

import java.util.Scanner;

public class Human {
	
	private String name;
	private int birth_year;
	private boolean is_married;
	
	public Human() {
		this.name = "�����";
		this.birth_year = 2020;
		this.is_married = false;
	}
	
	public Human(String name, int birth_year, boolean is_married) {
		this.name = name;
		this.birth_year = birth_year;
		this.is_married = is_married;	
	}
	
	public void showInfo() {
		String married = "";
		int age = 2021 - birth_year + 1;
		if ( is_married ) {
			married = "��ȥ";
		} else {
			married = "��ȥ";
		} 
		System.out.printf("�̸�: %s, ����⵵: %d, ���糪��: %d��, ��ȥ����: %s", name, birth_year, age, married);
	}
	
	public void marry() {
		if( is_married ) {
			System.out.println("��ȥ �Դϴ�.");
		} else {
			is_married = true;
		}
	}
	
	public void divorce() {
		if( is_married ) {
			is_married = false;
		} else {
			System.out.println("���� ��ȥ�Դϴ�.");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Human h1 = new Human(sc.next(),  sc.nextInt(), sc.nextBoolean());
		
		h1.showInfo();
		System.out.println();
		h1.divorce();
		h1.marry();
	}

}
