package org.oop.homework;

public class VIPCustomer extends Customer{
	
	int agentID; // 대리인
	double saleRate; // 할인율
	
	public VIPCustomer(String customerName, int customerAge) {
		super(customerName, customerAge);
		
		customerGrade = "VIP";
		bonusRate = 0.4;
		saleRate = 0.1;
		agentID = (int)(Math.random() * 10000) + 1;
	}
	
	@Override
	public void calPrice(int price) {
		bonusPoint += price * bonusRate;
		price -= (int)(price * saleRate);
		System.out.printf("%s님이 %d원을 지불하셨습니다.\n", customerName, price);
	}
	
	public void getAgentID() {
		System.out.printf("%s님의 대리인 ID는 %d입니다.\n", customerName, agentID);
	}
	
	public void AccessLounge() {
		System.out.println("VIP전용 라운지에 입장하셨습니다.");
	}
}
