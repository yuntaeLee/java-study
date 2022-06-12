package innerclass;

class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	private class InClass { // ��κ� Ŭ���� ���ο����� ���Ǳ� ������ private ���� ����
		
		int iNum = 100;
		
		void inTest() {
			System.out.println("OutClass num = " +num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass inNum = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass {
		
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			
//			System.out.println("OutClass num = " +num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)"); ���x
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass inNum = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
		}
		
		static void sTest() {
			
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass inNum = " + sInNum + "(���� Ŭ������ �ν��Ͻ� ����)");
		}
	}
}


public class InnerTest {

	public static void main(String[] args) {
//
//		OutClass outClass = new OutClass();
//		outClass.usingClass();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		System.out.println();
		OutClass.InStaticClass.sTest();
	}

}
