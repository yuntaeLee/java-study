package org.oop.abstractclass.homework;

public class VIPCustomer extends CustomerAbstract{

	int agentId;
	double saleRate;
	
	public VIPCustomer(String cn, int ca) {
		super.customerName = cn;
		super.customerAge = ca;
		
		super.customerGrade = "VIP";
		super.bonusRate = 0.4;
		saleRate = 0.1;
		agentId = (int)(Math.random() * 10000) + 1;
	}
	
	@Override
	public void calPrice(int price) {
		bonusPoint += price * bonusRate;
		price -= (int)(price * saleRate);
		System.out.printf("%s님이 %d원을 지불하셨습니다.\n", customerName, price);
	}

	public void getAgentId() {
		System.out.printf("%s님의 대리인 ID는 %d입니다.\n", customerName, agentId);
	}
	
	@Override
	public void showCustomerInfo() {
		System.out.printf("%s님의 나이는 %d살이며, 등급은 %s이고, 보너스 포인트는 %d입니다.\n", customerName, customerAge, customerGrade, bonusPoint);
	}
	
	public void AccessLounge() {
		System.out.println("VIP전용 라운지에 입장하셨습니다.");
	}
}
