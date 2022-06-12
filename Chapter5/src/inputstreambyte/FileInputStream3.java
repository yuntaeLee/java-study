package inputstreambyte;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream3 {

	public static void main(String[] args) {
		
		int i;
		
		try (FileInputStream fis = new FileInputStream("input2.txt");) {
			
			byte[] bs = new byte[10];
			
			while( (i = fis.read(bs)) != -1) {
				
				for(int j=0; j<i; j++) { // QRST 제거
					System.out.print((char)bs[j]);
				}
				System.out.println(" : " + i + "바이트 읽음");
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
