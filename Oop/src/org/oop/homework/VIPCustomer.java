package org.oop.homework;

public class VIPCustomer extends Customer{
	
	int agentID; // �븮��
	double saleRate; // ������
	
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
		System.out.printf("%s���� %d���� �����ϼ̽��ϴ�.\n", customerName, price);
	}
	
	public void getAgentID() {
		System.out.printf("%s���� �븮�� ID�� %d�Դϴ�.\n", customerName, agentID);
	}
	
	public void AccessLounge() {
		System.out.println("VIP���� ������� �����ϼ̽��ϴ�.");
	}
}
