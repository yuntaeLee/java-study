package org.oop.homework;

public class Customer {
	
	String customerName, customerGrade; // �̸�, ���
	int customerAge, bonusPoint; // ����, ���ʽ� ����Ʈ
	double bonusRate; // ���ʽ� ����
	
	
	public Customer(String customerName, int customerAge) {
		this.customerName = customerName;
		this.customerAge = customerAge;
		
		customerGrade = "Normal";
		bonusRate = 0.1;
	}
	
	public void calPrice(int price) {
		bonusPoint += price * bonusRate;
		System.out.printf("%s���� %d���� �����ϼ̽��ϴ�.\n", customerName, price);
	}
	
	
	public void showCustomerInfo() {
		System.out.printf("%s���� ���̴� %d���̸�, ����� %s�̰�, ���ʽ� ����Ʈ�� %d�Դϴ�.\n", customerName, customerAge, customerGrade, bonusPoint);
	}
}
