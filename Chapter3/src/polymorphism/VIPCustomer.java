package polymorphism;

public class VIPCustomer extends Customer{
	
	double saleRatio; // ���η�
	private int agentID;
	
//	public VIPCustomer() {
////		super(0, null);  // �ڵ����� ����
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//		customerGrade = "VIP";
//		
//		System.out.println("VIPCustomer() call");
//	}
	
	public VIPCustomer(int customerID, String customerName) {
		
		super(customerID, customerName);
		
		bonusRatio = 0.05;
		saleRatio = 0.1;
		customerGrade = "VIP";	
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * saleRatio);
		return price;
	}
	
	
	public int getAgentID() {
		return agentID;
	}
	
}
