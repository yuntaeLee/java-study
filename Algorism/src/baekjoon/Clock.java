package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Clock {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
		MClock(h, m);
	}
	
	public static void MClock(int h, int m) {
		if(m-45>=0) {
			System.out.printf("%d %d",h,m-45);
		}else {
			if(h-1>=0) {
			System.out.printf("%d %d",h-1,m-45+60);
			}else {
				System.out.printf("%d %d",h-1+24,m-45+60);
			}
		}
		
	}

}
