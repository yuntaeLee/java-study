package org.oop.polymorphism;

class Super {
	int x = 100;
	int y = 200;
	
	public void ss() {
		System.out.println("�θ� Ŭ����");
	}
}

class Child extends Super {
	int j = 1000;
	int z = 2000;
	
	public void ss() {
		System.out.println("�ڽ� Ŭ����");
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
		// �ڽ�Ŭ�������� �������̵��� �޼ҵ带 �����ϰ�� �θ� Ŭ������ ������ �޼ҵ忡��
		// ���� ������.
		sp1.ss();
	}

}
