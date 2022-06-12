package org.oop.datastructure;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();
		
		stack.push("Book1");
		stack.push("Book2");
		stack.push("Book3");
		
		System.out.println("������ ũ��: " + stack.size());
		System.out.println("Book1�� �ִ°�? " + stack.contains("Book1"));
		
		System.out.println(stack.pop());
		System.out.println("������ ũ��: " + stack.size());
		
		System.out.println(stack.pop());
		System.out.println("������ ũ��: " + stack.size());
		
		System.out.println(stack.pop());
		System.out.println("������ ũ��: " + stack.size());
		
	}

}
