package org.oop.practice;

public class Animal {

	private int weight;
	
	public Animal() {
		
	}
	
	public Animal(int weight) {
		this.weight = weight;
	}
	
	public void move() {
		System.out.println("�����Դϴ�.");
	}
	
	public int get_weight() {
		return this.weight;
	}
}
