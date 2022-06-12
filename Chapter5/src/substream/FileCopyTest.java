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
		
		System.out.println(millisecond + "�ҿ� �Ǿ����ϴ�.");
		
		
		// *****************************
		// ex) ä��
		Socket socket = new Socket();
		
		// �ӵ� ������(BufferedReader) �ѱ۷�(InputSteamReader) why? getInputStream�� byte �̱� ������ �ѱ� �ν� �Ұ�.
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
