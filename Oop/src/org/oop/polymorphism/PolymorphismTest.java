package org.oop.polymorphism;

class Human {
	public void call() {
		System.out.println("Human Call");
	}
}

class Cheolsu extends Human {
	
	public void call() {
		System.out.println("Cheolsu Call");
	}
	
	public void status() {
		System.out.println("Cheolsu Status");
	}
}

public class PolymorphismTest {

	public static void main(String[] args) {
		// 다형성 예제
		Human h = new Cheolsu(); // Human 객체에 Cheolsu 객체를 넣음
//		Cheolsu c = new Human();
		// 작은 개념의 객체에 큰 개념의 객체를 넣을 수는 없음.
		h.call(); // Cheolsu Call이 나오게 됨
//		h.status(); // Human에 존재하지 않는 메소드는 사용 불가
	}
}
