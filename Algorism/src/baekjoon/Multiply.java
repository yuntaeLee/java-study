package baekjoon;

import java.util.Scanner;
public class Multiply {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		int newB = b;
		while(newB > 0) {
			System.out.println(a * (newB % 10));
			newB = newB / 10;
		}
		System.out.println(a * b);
		
		
		
		int k = (b - (b%100))/100;      // 100�� �ڸ��� 
        int i = ((b%100) - (b%10))/10; //10�� �ڸ��� 
        int j = b%10;             // 1�� �ڸ��� 

        System.out.println(a*j);
        System.out.println(a*i);
        System.out.println(a*k);
        System.out.println(a*b);
        
        
       
	}

}
