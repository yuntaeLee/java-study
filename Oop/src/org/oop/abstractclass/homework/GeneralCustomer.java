package org.oop.abstractclass.homework;

public class GeneralCustomer extends CustomerAbstract{

	public GeneralCustomer(String customerName, int customerAge) {
		super.customerName = customerName;
		super.customerAge = customerAge;
		
		super.customerGrade = "General";
		super.bonusRate = 0.1;
	}
	
	@Override
	public void calPrice(int price) {
		bonusPoint += price * bonusRate;
		System.out.printf("%s님이 %d원을 지불하셨습니다.\n", customerName, price);		
	}

	@Override
	public void showCustomerInfo() {
		System.out.printf("%s님의 나이는 %d살이며, 등급은 %s이고, 보너스 포인트는 %d입니다.\n", customerName, customerAge, customerGrade, bonusPoint);		
	}

}
