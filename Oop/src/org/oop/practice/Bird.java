package org.oop.practice;

public class Bird extends Animal {

	private int size;
	
	public Bird() {
		
	}
	
	public Bird(int size, int weight) {
		super(weight);
		this.size = size;
	}
	
	public void twitter() {
		System.out.println("지저귑니다.");
	}
	
	public int get_size() {
		return this.size;
	}
	

	public static void main(String[] args) {

		Bird b01 = new Bird();
		b01.move();
		b01.twitter();
		
		Bird b02 = new Bird(160, 90);
		System.out.println("사이즈는 " + b02.get_size() + "입니다.");
		System.out.println("무게는 " + b02.get_weight() + "입니다.");
		
	}

}
