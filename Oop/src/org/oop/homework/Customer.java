package org.oop.homework;

public class Customer {
	
	String customerName, customerGrade; // 이름, 등급
	int customerAge, bonusPoint; // 나이, 보너스 포인트
	double bonusRate; // 보너스 비율
	
	
	public Customer(String customerName, int customerAge) {
		this.customerName = customerName;
		this.customerAge = customerAge;
		
		customerGrade = "Normal";
		bonusRate = 0.1;
	}
	
	public void calPrice(int price) {
		bonusPoint += price * bonusRate;
		System.out.printf("%s님이 %d원을 지불하셨습니다.\n", customerName, price);
	}
	
	
	public void showCustomerInfo() {
		System.out.printf("%s님의 나이는 %d살이며, 등급은 %s이고, 보너스 포인트는 %d입니다.\n", customerName, customerAge, customerGrade, bonusPoint);
	}
}
