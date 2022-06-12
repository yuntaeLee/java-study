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
		System.out.printf("%s���� %d���� �����ϼ̽��ϴ�.\n", customerName, price);		
	}

	@Override
	public void showCustomerInfo() {
		System.out.printf("%s���� ���̴� %d���̸�, ����� %s�̰�, ���ʽ� ����Ʈ�� %d�Դϴ�.\n", customerName, customerAge, customerGrade, bonusPoint);		
	}

}
