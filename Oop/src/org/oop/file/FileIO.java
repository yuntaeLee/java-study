package org.oop.file;

import java.io.*;
import java.util.Scanner;

public class FileIO {
	public static void main(String[] args) {

		File f = new File("E:/out.txt");
		
		try {
			Scanner s = new Scanner(f);
			while (s.hasNext()) {
				System.out.println(s.next());
			}
			s.close();
		} catch (FileNotFoundException e) {
			// ������ ���� ���
			System.out.println("dfsd");
		}
	}

}
