package org.oop.practice;

class Super {
	int x = 100;
	int y = 200;
	public Super() {
		System.out.println("부모클래스 생성자");
	}
	
	public void ss() {
		System.out.println("부모클래스");
	}
}

class Child extends Super {
	int j = 1000;
	int z = 2000;
	
	public Child() {
		System.out.println("자식클래스 생성자");
	}
	public void ss() {
		System.out.println("자식클래스");
	}
	
}

public class Mm1 {
	public static void main(String[] args) {
		Super sp = new Super();
		Child ch = new Child();
		Super sp1 = new Child();
		System.out.println(sp1.x + sp1.y);
		sp1.ss();
		System.out.println(sp.x + ch.x + ((Child)sp1).j);
	}

}
