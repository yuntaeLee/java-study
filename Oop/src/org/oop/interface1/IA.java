package org.oop.interface1;

public class IA implements I1, I2 {

	// ���� �ߺ��Ǵ� ���̰�, ������ �ϳ��� �����ϱ� ������ ����
	@Override
	public void x() {
		System.out.println("sdfd");
	}
	
	public static void main(String[] args) {
		
		IA i = new IA();
		i.x();
		
	}
}
