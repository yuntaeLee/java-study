package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Qu {

	public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		quardrant(x,y);
		
	}
	
	public static void quardrant(int x, int y) throws NumberFormatException, IOException {
		if( x > 0 && y > 0 ) {
			System.out.println(1);
		} else if (x < 0 && y > 0) {
			System.out.println(2);
		} else if ( x > 0 && y < 0 ) {
			System.out.println(4);
		} else System.out.println(3);
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			x = Integer.parseInt(br.readLine());
			y = Integer.parseInt(br.readLine());
			if (x >= -1000 && x <= 1000 && x != 0 && y >= -1000 && y <= 1000 && y != 0)
				break;
		}

		if (x > 0 && y > 0) {
			System.out.println("1");
		} else if (x < 0 && y > 0) {
			System.out.println("2");
		} else if (x < 0 && y < 0) {
			System.out.println("3");
		} else if (x > 0 && y < 0) {
			System.out.println("4");
		}

	}
	
}
