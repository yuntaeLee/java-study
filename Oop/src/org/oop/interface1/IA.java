package org.oop.interface1;

public class IA implements I1, I2 {

	// 선언만 중복되는 것이고, 구현은 하나만 존재하기 때문에 가능
	@Override
	public void x() {
		System.out.println("sdfd");
	}
	
	public static void main(String[] args) {
		
		IA i = new IA();
		i.x();
		
	}
}
