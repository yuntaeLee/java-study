package org.oop.aaexam;

public abstract class Product {
	int price;
	int warranty;
	int use;
	
	public abstract void operate();
	
	public void depreciation_expense() {
		double result = (price / warranty) * use;
		
		if( result < 0) {
			result = 0;
		}
		System.out.println("감가상각비: " + result);
	}
}
