package org.oop.homework;

public class CustomerTest {

	public static void main(String[] args) {

		System.out.println("60161069 ¿Ã¿±≈¬");
		Customer customerT = new Customer("Tomas", 25);
		VIPCustomer customerJ = new VIPCustomer("Jake", 37);
		
		customerT.calPrice(2000);
		customerJ.calPrice(2000);
		
		customerJ.AccessLounge();
		customerJ.getAgentID();
		
		customerT.showCustomerInfo();
		customerJ.showCustomerInfo();
		
	}
}
