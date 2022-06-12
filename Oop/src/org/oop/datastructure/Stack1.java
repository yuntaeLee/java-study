package org.oop.datastructure;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<>();
		
		stack.push("Book1");
		stack.push("Book2");
		stack.push("Book3");
		
		System.out.println("스택의 크기: " + stack.size());
		System.out.println("Book1이 있는가? " + stack.contains("Book1"));
		
		System.out.println(stack.pop());
		System.out.println("스택의 크기: " + stack.size());
		
		System.out.println(stack.pop());
		System.out.println("스택의 크기: " + stack.size());
		
		System.out.println(stack.pop());
		System.out.println("스택의 크기: " + stack.size());
		
	}

}
