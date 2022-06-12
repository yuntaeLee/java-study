package org.oop.inheritance;

public class CalculatorAvg extends Calculator{
	

	public CalculatorAvg(int x, int y) { // ���� Ŭ���� ������ ȣ��� �θ� Ŭ������ �⺻������ �ڵ� ȣ��
//		super.x = x; // ������ ȣ�� ������ ���Ұ�
		super(x, y);
		super.x = x; // ������ ȣ�� �� ��� ���� 
	}
	
	public int avg() {
		return (super.x + super.y) / 2;
	}

	public static void main(String[] args) {

		CalculatorAvg c = new CalculatorAvg(10, 20);
		System.out.println(c.avg());
	}

}
