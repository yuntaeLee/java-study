package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Plus {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int loopCount = Integer.parseInt(br.readLine());
		
		AddArray(loopCount);
	}
	
	public static void AddArray(int loopCount) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> plusArray = new ArrayList<>();
		
		while(loopCount > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
	        int b = Integer.parseInt(st.nextToken());
			plusArray.add(a);
			plusArray.add(b);
			loopCount--;
		}
		PlusElement(plusArray);
		return;
	}
	
	public static void PlusElement(ArrayList<Integer> plusArray) {
		for ( int i = 0; i < plusArray.size(); i++ ) {
			if( i % 2 != 0 ) {
				System.out.println(plusArray.get(i-1) + plusArray.get(i));
			}
		}
		return;
	}

}
