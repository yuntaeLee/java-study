package stringbuffer;

public class StringBiulderTest {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		
		// StringBuilder�� ����ϸ� �޸� �ּҰ� ������.
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer));
		
		String test = buffer.toString();
		System.out.println(test);
		System.out.println(buffer);
	}

}
