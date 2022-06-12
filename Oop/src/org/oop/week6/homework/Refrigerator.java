package org.oop.week6.homework;

public class Refrigerator {
	
	int temp;
	boolean isOn = false;

	public void switchOn() {
		if( isOn == false ) {
			isOn = true;
			System.out.println("전원 플러그 연결");
		} else {
			System.out.println("이미 전원 플러그가 연결되어 있습니다.");
		}
	}
	
	public void switchOff() {
		if( isOn == true) {
			isOn = false;
			System.out.println("전원 플러그 뽑음");
		} else {
			System.out.println("이미 전원 플러그가 뽑혀 있습니다.");
		}
		
	}
	
	public void raiseTemp(int t) {
		if( isOn == true ) {
			temp += t;
			System.out.println(t + "도 만큼 냉장고의 온도를 올렸습니다.");
			System.out.println("현재 냉장고의 온도는 " + temp + "도 입니다.");
		} else {
			System.out.println("냉장고의 전원이 꺼져있어 작동할 수 없습니다.");
			return;
		}
	}
	
	public void lowerTemp(int t) {
		if( isOn == true) {
			temp -= t;
			System.out.println(t + "도 만큼 냉장고의 온도를 낮췄습니다.");
			System.out.println("현재 냉장고의 온도는 " + temp + "도 입니다.");
		} else {
			System.out.println("냉장고의 전원이 꺼져있어 작동할 수 없습니다.");
			return;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("60161069 이윤태");
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
