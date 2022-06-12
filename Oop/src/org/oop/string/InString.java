package org.oop.string;

import java.util.Scanner;

public class InString {

	public String ChangeString(String s) {
		
		s = s.replaceFirst("Human", "Java");
		s = s.replaceFirst("Java", "Human");
		return s;
		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = "Java Learning is similar with Human Learning";
		
		InString is = new InString();
		s = is.ChangeString(s);
		System.out.println(s);
		
		String[] arr = s.split(" ");
		
		String str = sc.next();
		String result = "";
		for( int i = 0; i < arr.length; i++) {
			if( arr[i].equals(str) ) {
				result = "Y";
				break;
			} else {
				result = "N";
			}
		}
		System.out.println(result);
		
		// 슬라이싱
		String s2 = s.substring(0, 5);
		System.out.println(s2);

		
//		// hello가 몇번 나오는지 
//		String str = "helloslkhellodjladfjhello";
//		String findStr = "hello";
//		int lastIndex = 0;
//		int count = 0;
//		while(lastIndex != -1){
//		    lastIndex = str.indexOf(findStr,lastIndex);
//		    if(lastIndex != -1){
//		        count ++;
//		        lastIndex += findStr.length();
//		    }
//		}
//		System.out.println(count);
	}

}
