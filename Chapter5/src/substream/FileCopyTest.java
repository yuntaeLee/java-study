package substream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopyTest {

	public static void main(String[] args) {

		long millisecond = 0;
		
		try( BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"));) {
			
			millisecond = System.currentTimeMillis();
			
			int i;
			while( (i = bis.read()) != -1 ) {
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis();
			
			
		} catch( IOException e) {
			System.out.println(e);
		}
		
		System.out.println(millisecond + "소요 되었습니다.");
		
		
		// *****************************
		// ex) 채팅
		Socket socket = new Socket();
		
		// 속도 빠르게(BufferedReader) 한글로(InputSteamReader) why? getInputStream은 byte 이기 때문에 한글 인식 불가.
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
