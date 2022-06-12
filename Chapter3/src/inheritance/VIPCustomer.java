package inheritance;

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
		System.out.println("VIPCustomer(int String) call");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
}
