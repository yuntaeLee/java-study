package inputstreambyte;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest1 {

	public static void main(String[] args) {
		
		
		System.out.println("알파벳을 여러 개 쓰고 [Enter]를 누르세요");
		
		int i;
		
		try {
			InputStreamReader irs = new InputStreamReader(System.in); // Byte 단위로 읽음 한글 가능
			while((i = irs.read()) != '\n') {
//				System.out.println(i);
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
