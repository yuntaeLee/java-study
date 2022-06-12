package org.oop.abstractclass.homework;

public class Microwave extends Home_appliance{

	private boolean is_clean;
	
	@Override
	public void operate() {
		if (super.battery_amount > 0) {
			System.out.println("���ڷ������� ���۽��׽��ϴ�.");
			super.battery_amount -= 10;
			this.is_clean = false;
		} else {
			System.out.println("���͸��� �����Ͽ� ������ �� �����ϴ�.");
		}
	}

	@Override
	public void reserve_operation(String a) {
		System.out.println(a + " ������ ����Ǿ����ϴ�.");
	}
	
	public void clean_micro() {
		this.is_clean = true;
		System.out.println("���ڷ����� û�Ҹ� �Ϸ��Ͽ����ϴ�.");
	}
	
	public void check_clean() {
		if ( this.is_clean ) System.out.println("���ڷ������� �����մϴ�.");
		else System.out.println("���ڷ������� �������ϴ�.");
	}
}
