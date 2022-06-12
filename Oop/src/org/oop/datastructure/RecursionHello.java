package org.oop.datastructure;

public class RecursionHello {

	public static void hello(int count) {
		if( count == 0 ) 
			return;
		
		System.out.println("Hello World!");
		
		hello(--count);
	}
	public static void main(String[] args) {
		hello(5);
	}

}
