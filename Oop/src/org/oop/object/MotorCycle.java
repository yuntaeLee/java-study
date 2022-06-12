package org.oop.object;

public class MotorCycle {

	boolean fuelIsFull;
	int speed;
	
	void fillFuel() {
		fuelIsFull = true;
		System.out.println("연료가 가득 찼습니다.");
	}
	
	void speedUp(int v) {
		speed += v;
		System.out.println("현재 속도는: " + this.speed);
	}
	
	void speedDown(int v) {
		speed -= v;
		if( speed < 0) speed = 0;
		System.out.println("현재 속도는: " + this.speed);
	}
	
	
	public static void main(String[] args) {

		MotorCycle mc = new MotorCycle();
		mc.fuelIsFull = false;
		mc.fillFuel();
		mc.speed = 0;
		mc.speedUp(40);
		mc.speedDown(30);
		mc.speedDown(20);
		
	}

}
