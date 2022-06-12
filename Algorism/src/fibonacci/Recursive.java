package fibonacci;

class fibo {
	public int fibonacciRecur(int n) {
		
		if (n == 0) return 0;
		if (n == 1) return 1;

		return fibonacciRecur(n-1) + fibonacciRecur(n-2);
	}
}

public class Recursive {
	
	public static void main(String[] args) {
		
		fibo fibo = new fibo();
		System.out.println(fibo.fibonacciRecur(10));

	}

}
