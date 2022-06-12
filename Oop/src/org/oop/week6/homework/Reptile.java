package org.oop.week6.homework;

interface Walkable {
	boolean can_walk = true;
	void walk();
}

interface Swimmable {
	boolean can_swim = true;
	void swim();
}

public class Reptile implements Walkable, Swimmable {

	@Override
	public void swim() {
			System.out.println("�����ϴ�.");
	}

	@Override
	public void walk() {
		System.out.println("�ȴ�.");
	}
	
	public static void main(String[] args) {
		System.out.println("60161069 ������");
		
		Reptile r = new Reptile();
		r.walk();
		r.swim();
	}
}
