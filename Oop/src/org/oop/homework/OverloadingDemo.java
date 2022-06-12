package org.oop.homework;

class Overloading {
	
	public void same(int i) {
		System.out.println("정수를 입력했습니다.");
	}
	
	public void same(double d) {
		System.out.println("실수를 입력했습니다.");
	}
	
	public void same(String s) {
		System.out.println("문자열을 입력했습니다.");
	}
}

public class OverloadingDemo {	
	public static void main(String[] args) {
		Overloading o = new Overloading();
		System.out.println("60161069 이윤태");
		o.same(3);
		o.same(3.5);
		o.same("one");
	}

}
