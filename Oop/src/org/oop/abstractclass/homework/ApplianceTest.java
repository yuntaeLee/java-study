package org.oop.abstractclass.homework;

public class ApplianceTest {

	public static void main(String[] args) {
		
		System.out.println("60161069 ������");
		Air_conditioner a = new Air_conditioner();
		Microwave m = new Microwave();
		
		a.operate();
		a.charge(-3);
		a.operate();
		a.reserve_operation("10�е� ����");
		a.get_serial_number();
		System.out.println();
		
		m.operate();
		m.charge(1000);
		m.operate();
		m.reserve_operation("�ص� ���");
		m.check_clean();
		m.clean_micro();
		m.check_clean();
	}
}
