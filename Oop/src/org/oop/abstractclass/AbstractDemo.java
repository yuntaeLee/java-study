package org.oop.abstractclass;

abstract class Animal {
	private String name;
	
	public abstract void move();
	public abstract void howl();
	
	Animal(String s) {
		name = s;
	}
}

class Horse extends Animal {

	public Horse(String s) {
		super(s);
	}
	
	@Override
	public void move() {
		System.out.println("�ٱ״�");
	}

	@Override
	public void howl() {
		System.out.println("������");
	}
	
}

class Fox extends Animal {

	public Fox(String s) {
		super(s);
	}
	
	@Override
	public void move() {
		System.out.println("��ӻ��");
	}

	@Override
	public void howl() {
		System.out.println("�ƿ��");
	}
	
}

public class AbstractDemo {
	public static void main(String[] args) {
		
		Horse h = new Horse("Horsy");
		Fox f = new Fox("Foxy");
		
		h.move();
		h.howl();
		f.move();
		f.howl();
	}
}
