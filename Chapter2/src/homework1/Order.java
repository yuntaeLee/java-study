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
		System.out.println("주문 접수 번호: " + orderId);
		System.out.println("주문 핸드폰 번호: " + phoneNumber);
		System.out.println("주문 집 주소: " + address);
	}

}
