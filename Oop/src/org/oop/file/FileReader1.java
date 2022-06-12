package org.oop.file;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) {
		// FileReader은 exception 처리 안할 시 error 
		try {
			int cnt = 0;
			// 파일 객체 생성
			File file = new File("E:/out.txt");
			// 입력 스트립 생성
			FileReader file_reader = new FileReader(file);
			int cur = 0;
			while((cur = file_reader.read()) != -1) {
				if ((char)cur == 'f') {
					cnt ++;
				}
				System.out.print((char)cur);
			}
			System.out.println();
			System.out.println(cnt);
			file_reader.close();
		} catch( FileNotFoundException e) {
			e.getStackTrace();
		} catch( IOException e) {
			e.getStackTrace();
		}
	}

}
