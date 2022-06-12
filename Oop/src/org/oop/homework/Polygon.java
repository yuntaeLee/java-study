package org.oop.homework;

import java.util.Scanner;

public class Polygon {

	private char shape;
	private int base;
	private int height;
	
	Polygon(char shape, int base, int height) {
		this.shape = shape;
		this.base = base;
		this.height = height;
	}
	
	void calArea() {
		if ( shape == 'T' ) calTriangleArea(base, height);
		else if( shape == 'R') calRectangleArea(base, height);
		else System.out.println("T 또는 s를 입력해주세요.");
	}
	
	private void calTriangleArea(int base, int height) {
		System.out.println(Float.valueOf(base * height) / 2);
	}
	
	private void calRectangleArea(int base, int height) {
		System.out.println(base * height);
	}
	
	static void printStdNumber() {
		System.out.println("60161069 이윤태\n");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		char shape = sc.next().charAt(0);
//		int base = sc.nextInt();
//		int height = sc.nextInt();
		
		printStdNumber();
		Polygon pg = new Polygon(sc.next().charAt(0), sc.nextInt(), sc.nextInt());
		sc.close();
		pg.calArea();
	}
}
