package part01;

public class BitOperation {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 10;
		
		System.out.println( num1 | num2 );
		System.out.println( num1 & num2 );
		System.out.println( num1 ^ num2 );
		System.out.println( ~num1 );
		
		System.out.println( num1 << 2 ); // 5*4, 2의 2승
		System.out.println( num1 <<=2 ); // 값을 바꾸려면 대입 연산자 입력
		System.out.println( num1 >> 1);		
		
		
	}

}
