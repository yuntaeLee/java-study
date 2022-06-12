package org.oop.formatting;

public class Formatting {

	public static void main(String[] args) {
		
		//자리수 지정은 안 했을 경우 왼쪽으로 정렬된다.
		System.out.printf("자리수 미지정 :%d%n",1);
		System.out.printf("자리수 미지정 :%d%n",10);
		System.out.printf("자리수 미지정 :%d%n",100);
		System.out.printf("자리수 미지정 :%d%n",1000);
		
		//자리수 지정했을 경우 오른쪽으로 정렬된다.
		System.out.printf("자리수 지정 :%4d%n",1);
		System.out.printf("자리수 지정 :%4d%n",10);
		System.out.printf("자리수 지정 :%4d%n",100);
		System.out.printf("자리수 지정 :%4d%n",1000);
		
		//자리수 지정 후 '-'사용하면 왼쪽으로 정렬된다.
		System.out.printf("자리수 지정('-'사용) :%-4d%n",1);
		System.out.printf("자리수 지정('-'사용) :%-4d%n",10);
		System.out.printf("자리수 지정('-'사용) :%-4d%n",100);
		System.out.printf("자리수 지정('-'사용) :%-4d%n",1000);
		
		//자리수 지정 후 '0'사용하면 오른쪽으로 정렬된다.
		System.out.printf("자리수 지정('0'사용) :%04d%n",1);
		System.out.printf("자리수 지정('0'사용) :%04d%n",10);
		System.out.printf("자리수 지정('0'사용) :%04d%n",100);
		System.out.printf("자리수 지정('0'사용) :%04d%n",1000);
		
		System.out.println(String.format("%d + %d 은 %d 입니다.", 10, 20, 30));
		System.out.printf("%d + %d 은 %d 입니다.", 10, 20, 30);
		
		// 자릿수
		// 플래그'-' 생략시 오른쪽 정렬
		System.out.printf("\n%5d, %-8s, %10f\n", 10, "안녕", 3.5);
		System.out.println();
		
		//
		System.out.printf("%-5s %8s %8s\n", "Name", "Total", "Avg");
		System.out.printf("%-5s %8d %8.2f\n", "Jones", 950, 80.2436);
		System.out.printf("%-5s %8d %8.2f\n", "Tom", 1050, 90.43);
		
		for( int i = 1; i < 17; i++ ) {
			System.out.printf("%3d", i);
			if ( i % 4 == 0 ) {
				System.out.println();
			}
		}
	}

}
