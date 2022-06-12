package baekjoon;

import java.io.*;
public class MultiplicationTable {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int num = Integer.parseInt(br.readLine());
		multiplication(num);
	}
	
	public static void multiplication(int num) {

		for(int i=1; i<10; i++) {
			System.out.println(num +  " * " + i + " = " + num * i);
		}
	}

}
