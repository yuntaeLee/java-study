package inheritance1;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010, "Lee");
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo() + price);
		System.out.println(customerLee.showCustomerInfo());
		
		
		VIPCustomer customerKim = new VIPCustomer(10020, "Kim");
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo() + price);
		System.out.println(customerKim.showCustomerInfo());
		
		Customer vc = new VIPCustomer(12345, "noname");
		price = vc.calcPrice(1000);
		System.out.println(vc.showCustomerInfo() + price);
		
	}

}
