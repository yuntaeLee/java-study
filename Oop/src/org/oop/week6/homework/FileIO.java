package org.oop.week6.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) {
		System.out.println("60161069 이윤태");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		sc.close();
		File f = new File("E:/Java.txt");
		
		try {
			Scanner s = new Scanner(f);
			int cnt = 0;
			
			while(s.hasNext()) {
				if( str.equals(s.next())) {
					cnt++;
				}
			}
			s.close();
			System.out.println(cnt);
			
		} catch ( FileNotFoundException e) {
			System.out.println("파일 존재여부를 확인하세요.");
		} 
	}
}
