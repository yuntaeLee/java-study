package stringbuffer;

public class StringTest {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java));
		java = java.concat(android);
		// concatenate �ص� �޸� �ּҴ� �ٸ�
		System.out.println(System.identityHashCode(java));
		
		// ���� StringaBuilder, StringBuffer Ȱ��
	}

}
