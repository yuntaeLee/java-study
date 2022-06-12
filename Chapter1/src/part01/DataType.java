package part01;

public class DataType {

	public static void main(String[] args) {
		
		long lnum = 12345678900L;
		double dnum = 3.14;
		float fnum = 3.14F;
		
		System.out.println(lnum);
		System.out.println(dnum);
		System.out.println(fnum);
		
		char a = 'A'; // "A" error
		char b = 66;
		int c = 67;
		
		System.out.println(a);
		System.out.println((int)a);
		System.out.println(b);
		System.out.println((char)c);
		
		final float PI = 3.14f; // constant 상수, 대문자로 선언
		System.out.println(PI);
		
		byte bNum = 125;
		int iNum = bNum;
		System.out.println(iNum);
		
		int iiNum = 10;
		float fNum = iiNum;
		System.out.println(fNum);
		
	}

}
