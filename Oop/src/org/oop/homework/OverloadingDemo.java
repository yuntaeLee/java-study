package org.oop.homework;

class Overloading {
	
	public void same(int i) {
		System.out.println("������ �Է��߽��ϴ�.");
	}
	
	public void same(double d) {
		System.out.println("�Ǽ��� �Է��߽��ϴ�.");
	}
	
	public void same(String s) {
		System.out.println("���ڿ��� �Է��߽��ϴ�.");
	}
}

public class OverloadingDemo {	
	public static void main(String[] args) {
		Overloading o = new Overloading();
		System.out.println("60161069 ������");
		o.same(3);
		o.same(3.5);
		o.same("one");
	}

}
