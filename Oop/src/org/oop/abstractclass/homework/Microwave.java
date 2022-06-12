package org.oop.abstractclass.homework;

public class Microwave extends Home_appliance{

	private boolean is_clean;
	
	@Override
	public void operate() {
		if (super.battery_amount > 0) {
			System.out.println("전자레인지를 동작시켰습니다.");
			super.battery_amount -= 10;
			this.is_clean = false;
		} else {
			System.out.println("베터리가 부족하여 동작할 수 없습니다.");
		}
	}

	@Override
	public void reserve_operation(String a) {
		System.out.println(a + " 동작이 예약되었습니다.");
	}
	
	public void clean_micro() {
		this.is_clean = true;
		System.out.println("전자레인지 청소를 완료하였습니다.");
	}
	
	public void check_clean() {
		if ( this.is_clean ) System.out.println("전자레인지가 깨끗합니다.");
		else System.out.println("전자레인지가 더럽습니다.");
	}
}
