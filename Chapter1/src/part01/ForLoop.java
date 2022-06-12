package part01;

public class ForLoop {

	public static void main(String[] args) {
		
		int count = 1;
		int sum = 0;
		
		for(int i= 0; i< 10; i++, count++) {
			sum += count;
		}
		System.out.println(count);
		System.out.println(sum);
	}

}
