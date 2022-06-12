package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		for( int num : arr ) {
			System.out.println(num);
		}
		System.out.println();
		
		Arrays.stream(arr).forEach(n->System.out.println(n));
		
		IntStream is = Arrays.stream(arr);
		System.out.println(is.sum());
		System.out.println();
		// 한번 사용하면 소멸 따라서 새롭게 생성해야 함.
		IntStream each = Arrays.stream(arr);
		each.forEach(n->System.out.println(n));
		
		
		
	}

}
