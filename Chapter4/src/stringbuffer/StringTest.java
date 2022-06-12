package stringbuffer;

public class StringTest {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java));
		java = java.concat(android);
		// concatenate 해도 메모리 주소는 다름
		System.out.println(System.identityHashCode(java));
		
		// 따라서 StringaBuilder, StringBuffer 활용
	}

}
