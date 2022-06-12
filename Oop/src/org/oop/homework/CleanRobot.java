package org.oop.homework;

public class CleanRobot {

	boolean status = false;
	int battery;
	int trashRate;

	void turnOn() {
		if(battery > 0) {
			status = true;
			System.out.println("�κ� û�ұ��� ������ �������ϴ�.");
		} else {
			System.out.println("���͸��� �����Ͽ� ������ �� �� �����ϴ�.");
		}
	}
	
	void turnOff() {
		status = false;
		System.out.println("�κ� û�ұ��� ������ ���� �Ǿ����ϴ�.");
		checkBattery();
		checkTrashRate();
	}
	
	void operate() {
		if ( status == false ) {
			System.out.println("������ �����־� �۵��� �� �����ϴ�.");
		} else if( battery <= 0 ) {
			System.out.println("���͸��� �����Ͽ� �۵��� �� �����ϴ�.");
		} else if( trashRate >= 100) {
			System.out.println("�����Ⱑ �������� �۵��� �� �����ϴ�.");
		} else {
			battery -= 20; // �ѹ� �۵��� ���͸��� 20% �Ҹ��Ѵٰ� ����
			trashRate += 25; // �ѹ� �۵��� �����Ⱑ 25% ���ٰ� ����
			System.out.println("�۵� ����");
		}
	}
	
	void checkBattery() {
		System.out.println("���� ���͸� �ܷ���" + battery + "% �Դϴ�.");
	}
	
	void charge(int c) {
		if(battery < c) {
			while(battery < c) {
				battery++;
			}
		} else System.out.println("�̹�" + c + "%�� ���͸��� �����Ǿ� �ֽ��ϴ�.");
		
		System.out.println(battery + "% ������ �Ϸ�Ǿ����ϴ�.");
	}
	
	void checkTrashRate() {
		System.out.println("�����Ⱑ " + trashRate + "% ä���� �ֽ��ϴ�.");
	}
	
	void emptyTrash() {
		trashRate = 0;
		System.out.println("�����⸦ ������ϴ�.");
	}
	
	static void printStdNumber() {
		System.out.println("60161069 ������\n");
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
