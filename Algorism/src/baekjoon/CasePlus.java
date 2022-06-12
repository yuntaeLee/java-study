package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CasePlus {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int loopCount = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int count = 1;
		
		while(loopCount > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
	        int b = Integer.parseInt(st.nextToken());
	        bw.write("Case #" + count++ +": " + (a+b)+ "\n");
			loopCount--;
			
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
