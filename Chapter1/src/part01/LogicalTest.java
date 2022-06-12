package part01;

public class LogicalTest {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ( (num1 += 10) <10 ) && ( (i += 2) < 10);
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i); // i 값은 증가x because && 연산자로 앞의 항의 false 이기 때문에 뒤에 항을 실행x
	}
}
