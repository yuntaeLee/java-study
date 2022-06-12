package fibonacci;

public class Memoization {

	int[] value;
	int number;
	
	public Memoization(int number) {
		this.number = number;
		value = new int[number];
	}
	
	public int fiboMemo(int n) {
		
		int result = 0;
		
		value[0] = 0;
		value[1] = 1;
		
		if (n == 0) return value[0];
		if (n == 1) return value[1];
		
		for(int i = 2; i<=n; i++) {
			
			
			value[i] = value[i-1] + value[i-2];
			result = value[i];
		}
		return result;
	}
	
	public static void main(String[] args) {

		Memoization memo = new Memoization(100);
		
		int result = memo.fiboMemo(10);
		System.out.println(result);
		
	}

}
