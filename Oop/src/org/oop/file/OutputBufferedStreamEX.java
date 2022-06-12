package org.oop.file;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputBufferedStreamEX {

	public static void main(String[] args) throws IOException {

		BufferedOutputStream bs = null;
		try {
			bs = new BufferedOutputStream( new FileOutputStream("E:/Output.txt"));
			String str = "재미있어요! 자바!";
			bs.write(str.getBytes());
		} catch ( Exception e) {
			e.getStackTrace();
		} finally {
			bs.close();
		}
	}

}
