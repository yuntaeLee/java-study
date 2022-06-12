package org.oop.abstractclass.homework;

public abstract class Home_appliance {

	int battery_amount;
	
	public abstract void operate();
	public abstract void reserve_operation(String a);
	
	public void charge(int time) {
		if ( time < 0 ) {
			System.out.println("0보다 작은 수는 입력하실 수 없습니다.");
			return;
		}
		
		battery_amount = battery_amount + (time * 10);
		
		if ( battery_amount > 100 ) {
			battery_amount = 100;
		}
		
		System.out.println(time + "시간 충전 완료");
		System.out.println("현재배터리 잔량: " + battery_amount + "%");
	}
}
