package org.oop.file;

import java.io.FileInputStream;

public class FileStream {

	public static void main(String[] args) {

		try {
			FileInputStream fileStream = null; // ���� ��Ʈ��
			// ���� ��Ʈ�� ����
			fileStream = new FileInputStream("E:/out.txt");
			// ���� ����
			byte[] readBuffer = new byte[fileStream.available()];
			while( fileStream.read( readBuffer ) != -1) {}
			System.out.println(new String(readBuffer)); // ���
			fileStream.close(); // ��Ʈ�� �ݱ�
		} catch( Exception e) {
			e.getStackTrace();
		}
	}

}
