package org.oop.inheritance;

public class CalculatorAvg extends Calculator{
	

	public CalculatorAvg(int x, int y) { // 하위 클래스 생성자 호출시 부모 클래스의 기본생성자 자동 호출
//		super.x = x; // 생성자 호출 전에는 사용불가
		super(x, y);
		super.x = x; // 생성자 호출 후 사용 가능 
	}
	
	public int avg() {
		return (super.x + super.y) / 2;
	}

	public static void main(String[] args) {

		CalculatorAvg c = new CalculatorAvg(10, 20);
		System.out.println(c.avg());
	}

}
