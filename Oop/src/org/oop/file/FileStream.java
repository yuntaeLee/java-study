package org.oop.file;

import java.io.FileInputStream;

public class FileStream {

	public static void main(String[] args) {

		try {
			FileInputStream fileStream = null; // 파일 스트림
			// 파일 스트림 생성
			fileStream = new FileInputStream("E:/out.txt");
			// 버퍼 선언
			byte[] readBuffer = new byte[fileStream.available()];
			while( fileStream.read( readBuffer ) != -1) {}
			System.out.println(new String(readBuffer)); // 출력
			fileStream.close(); // 스트립 닫기
		} catch( Exception e) {
			e.getStackTrace();
		}
	}

}
