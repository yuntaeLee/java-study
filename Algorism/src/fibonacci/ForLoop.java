package fibonacci;

public class ForLoop {
	
	public int finonacciIter(int n) {
		
		int ppre = 0;
		int pre = 1;
		int current = 0;
		
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		for (int i = 2; i<=n; i++) {
			
			current = ppre + pre;
			ppre = pre;
			pre = current;
		}
		return current;
	
	}

	public static void main(String[] args) {

		ForLoop fibofor = new ForLoop();
		System.out.println(fibofor.finonacciIter(3));
	}
}
