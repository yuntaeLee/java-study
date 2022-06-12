package org.oop.homework;

public class CleanRobot {

	boolean status = false;
	int battery;
	int trashRate;

	void turnOn() {
		if(battery > 0) {
			status = true;
			System.out.println("로봇 청소기의 전원이 켜졌습니다.");
		} else {
			System.out.println("배터리가 부족하여 전원을 켤 수 없습니다.");
		}
	}
	
	void turnOff() {
		status = false;
		System.out.println("로봇 청소기의 전원이 종료 되었습니다.");
		checkBattery();
		checkTrashRate();
	}
	
	void operate() {
		if ( status == false ) {
			System.out.println("전원이 꺼져있어 작동할 수 없습니다.");
		} else if( battery <= 0 ) {
			System.out.println("배터리가 부족하여 작동할 수 없습니다.");
		} else if( trashRate >= 100) {
			System.out.println("쓰레기가 가득차서 작동할 수 없습니다.");
		} else {
			battery -= 20; // 한번 작동시 베터리가 20% 소모한다고 가정
			trashRate += 25; // 한번 작동시 쓰레기가 25% 찬다고 가정
			System.out.println("작동 시작");
		}
	}
	
	void checkBattery() {
		System.out.println("남은 배터리 잔량은" + battery + "% 입니다.");
	}
	
	void charge(int c) {
		if(battery < c) {
			while(battery < c) {
				battery++;
			}
		} else System.out.println("이미" + c + "%의 배터리가 충전되어 있습니다.");
		
		System.out.println(battery + "% 충전이 완료되었습니다.");
	}
	
	void checkTrashRate() {
		System.out.println("쓰레기가 " + trashRate + "% 채워져 있습니다.");
	}
	
	void emptyTrash() {
		trashRate = 0;
		System.out.println("쓰레기를 비웠습니다.");
	}
	
	static void printStdNumber() {
		System.out.println("60161069 이윤태\n");
	}
	
	
	public static void main(String[] args) {
		printStdNumber();
		CleanRobot cr = new CleanRobot();
		cr.operate();
		cr.turnOn();
		cr.charge(60);
		cr.turnOn();
		cr.operate();
		cr.operate();
		cr.checkBattery();
		cr.checkTrashRate();
		cr.operate();
		cr.operate();
		cr.charge(30);
		cr.operate();
		cr.operate();
		cr.emptyTrash();
		cr.turnOff();	
	}
}
