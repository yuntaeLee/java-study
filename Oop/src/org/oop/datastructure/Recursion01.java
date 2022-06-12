package org.oop.datastructure;

public class Recursion01 {

	public static void main(String[] args) {
		method_A();
	}
	
	public static void method_A() {
		method_B();
	}
	
	public static void method_B() {
		method_C();
	}
	
	public static void method_C() {
		return;
	}
	// ***시험: 피보나치 재귀함수
}
