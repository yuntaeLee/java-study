package org.oop.abstractclass.homework;

public abstract class Home_appliance {

	int battery_amount;
	
	public abstract void operate();
	public abstract void reserve_operation(String a);
	
	public void charge(int time) {
		if ( time < 0 ) {
			System.out.println("0���� ���� ���� �Է��Ͻ� �� �����ϴ�.");
			return;
		}
		
		battery_amount = battery_amount + (time * 10);
		
		if ( battery_amount > 100 ) {
			battery_amount = 100;
		}
		
		System.out.println(time + "�ð� ���� �Ϸ�");
		System.out.println("������͸� �ܷ�: " + battery_amount + "%");
	}
}
