package org.oop.string;

public class OddString {

	public static void main(String[] args) {

		String s = "abcdefghijklmnopqrstuvwxyz";
		
		for( int i=0; i<s.length(); i+=2) {
			System.out.print(s.charAt(i));
		}
		
		System.out.println();
		
		char[] as = new char[s.length()];
		
		for( int i=0; i<s.length(); i++) {
			as[i] = s.charAt(i);
		}
		
		for( int i=0; i<as.length; i+=2) {
			System.out.print(as[i]);
		}
		
	}

}
