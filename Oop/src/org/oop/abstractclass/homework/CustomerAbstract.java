package org.oop.abstractclass.homework;

public abstract class CustomerAbstract {
	
	String customerName, customerGrade;
	int customerAge, bonusPoint;
	double bonusRate;
	
	public abstract void calPrice(int price);
	public abstract void showCustomerInfo();

}
