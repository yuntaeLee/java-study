package org.oop.week6.homework;

public class Refrigerator {
	
	int temp;
	boolean isOn = false;

	public void switchOn() {
		if( isOn == false ) {
			isOn = true;
			System.out.println("���� �÷��� ����");
		} else {
			System.out.println("�̹� ���� �÷��װ� ����Ǿ� �ֽ��ϴ�.");
		}
	}
	
	public void switchOff() {
		if( isOn == true) {
			isOn = false;
			System.out.println("���� �÷��� ����");
		} else {
			System.out.println("�̹� ���� �÷��װ� ���� �ֽ��ϴ�.");
		}
		
	}
	
	public void raiseTemp(int t) {
		if( isOn == true ) {
			temp += t;
			System.out.println(t + "�� ��ŭ ������� �µ��� �÷Ƚ��ϴ�.");
			System.out.println("���� ������� �µ��� " + temp + "�� �Դϴ�.");
		} else {
			System.out.println("������� ������ �����־� �۵��� �� �����ϴ�.");
			return;
		}
	}
	
	public void lowerTemp(int t) {
		if( isOn == true) {
			temp -= t;
			System.out.println(t + "�� ��ŭ ������� �µ��� ������ϴ�.");
			System.out.println("���� ������� �µ��� " + temp + "�� �Դϴ�.");
		} else {
			System.out.println("������� ������ �����־� �۵��� �� �����ϴ�.");
			return;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("60161069 ������");
		Refrigerator r = new Refrigerator();
		r.temp = 10;
	
		r.raiseTemp(2);
		r.switchOn();
		r.raiseTemp(2);
		r.lowerTemp(30);
		r.switchOff();
		r.switchOff();
	}

}
