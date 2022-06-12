package org.oop.polymorphism;

class Super {
	int x = 100;
	int y = 200;
	
	public void ss() {
		System.out.println("부모 클래스");
	}
}

class Child extends Super {
	int j = 1000;
	int z = 2000;
	
	public void ss() {
		System.out.println("자식 클래스");
	}
	
	public void x() {
		System.out.println("dd");
	}
}

public class M1 {
	public static void main(String[] args) {
		Super sp = new Super();
		Child ch = new Child();
		Super sp1 = new Child();
		System.out.println(sp1.x + sp1.y);
//		System.out.println(sp1.j); // error
		// 자식클래스에서 오버라이딩한 메소드를 제외하고는 부모 클래스의 변수와 메소드에만
		// 접근 가능함.
		sp1.ss();
	}

}
