package study;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Input {

	public static void main(String[] args) {

		InputStream inputstream = System.in;
		InputStreamReader sr = new InputStreamReader(inputstream);
		BufferedReader br = new BufferedReader(sr);
	}

}
