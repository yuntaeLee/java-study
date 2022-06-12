package org.oop.aaexam;

public class Number9 {

	public static void main(String[] args) {
		
		int num = 200;
		int x[] = { 2, 5, 0, 10, 1 };
		
		try {
			for(int i=0; i<x.length; ++i){
				 System.out.println(num/x[i]);
			 }
		} catch(ArithmeticException e) {
			System.out.println("¿À·ù");
		}
		

	}

}
