package org.oop.abstractclass.homework;

public class Air_conditioner extends Home_appliance{

	private int serial_number;
	
	public Air_conditioner() {
		this.serial_number = (int)(Math.random() * 10000) + 1;
	}
	
	@Override
	public void operate() {
		if( super.battery_amount > 0 ) {
			System.out.println("에어컨을 동작시켰습니다.");
			super.battery_amount -= 10; // 한번 동작시 베터리 10% 소모
		} else {
			System.out.println("베터리가 부족하여 동작할 수 없습니다.");
		}
	}

	@Override
	public void reserve_operation(String a) {
		System.out.println(a + " 동작이 예약되었습니다.(에어컨)");
	}
	
	public void get_serial_number() {
		System.out.println("에어컨 일련번호: " + this.serial_number);
	}
}
