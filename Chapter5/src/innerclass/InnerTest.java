package innerclass;

class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	private class InClass { // 대부분 클래스 내부에서만 사용되기 때문에 private 으로 선언
		
		int iNum = 100;
		
		void inTest() {
			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass {
		
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			
//			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)"); 사용x
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
		}
		
		static void sTest() {
			
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 인스턴스 변수)");
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
