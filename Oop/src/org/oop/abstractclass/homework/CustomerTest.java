package org.oop.abstractclass.homework;

public class CustomerTest {

	public static void main(String[] args) {

		System.out.println("60161069 ¿Ã¿±≈¬");
		GeneralCustomer customerT = new GeneralCustomer("Tomas", 25);
		VIPCustomer customerJ = new VIPCustomer("Jake", 37);
		
		customerT.calPrice(2000);
		customerJ.calPrice(2000);
		
		customerJ.AccessLounge();
		customerJ.getAgentId();
		
		customerT.showCustomerInfo();
		customerJ.showCustomerInfo();
	}

}
