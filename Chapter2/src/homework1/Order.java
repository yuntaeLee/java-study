package homework1;

public class Order {
	
	public int orderId;
	public String phoneNumber;
	public String address;
	public int orderDate;
	public int orderTime;
	public int orderPrice;
	public String menuId;
	
	public Order(int orderId, String phoneNumber, String address) {
		this.orderId = orderId;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public void showOrderInfo() {
		System.out.println("�ֹ� ���� ��ȣ: " + orderId);
		System.out.println("�ֹ� �ڵ��� ��ȣ: " + phoneNumber);
		System.out.println("�ֹ� �� �ּ�: " + address);
	}

}
