package org.oop.abstractclass.homework;

public class Air_conditioner extends Home_appliance{

	private int serial_number;
	
	public Air_conditioner() {
		this.serial_number = (int)(Math.random() * 10000) + 1;
	}
	
	@Override
	public void operate() {
		if( super.battery_amount > 0 ) {
			System.out.println("�������� ���۽��׽��ϴ�.");
			super.battery_amount -= 10; // �ѹ� ���۽� ���͸� 10% �Ҹ�
		} else {
			System.out.println("���͸��� �����Ͽ� ������ �� �����ϴ�.");
		}
	}

	@Override
	public void reserve_operation(String a) {
		System.out.println(a + " ������ ����Ǿ����ϴ�.(������)");
	}
	
	public void get_serial_number() {
		System.out.println("������ �Ϸù�ȣ: " + this.serial_number);
	}
}
