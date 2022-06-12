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
		System.out.println("다그닥");
	}

	@Override
	public void howl() {
		System.out.println("히히힝");
	}
	
}

class Fox extends Animal {

	public Fox(String s) {
		super(s);
	}
	
	@Override
	public void move() {
		System.out.println("사뿐사뿐");
	}

	@Override
	public void howl() {
		System.out.println("아우우");
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
