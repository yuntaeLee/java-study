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
		// ������ ����
		Human h = new Cheolsu(); // Human ��ü�� Cheolsu ��ü�� ����
//		Cheolsu c = new Human();
		// ���� ������ ��ü�� ū ������ ��ü�� ���� ���� ����.
		h.call(); // Cheolsu Call�� ������ ��
//		h.status(); // Human�� �������� �ʴ� �޼ҵ�� ��� �Ұ�
	}
}
