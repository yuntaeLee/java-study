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
		System.out.printf("%s���� %d���� �����ϼ̽��ϴ�.\n", customerName, price);
	}

	public void getAgentId() {
		System.out.printf("%s���� �븮�� ID�� %d�Դϴ�.\n", customerName, agentId);
	}
	
	@Override
	public void showCustomerInfo() {
		System.out.printf("%s���� ���̴� %d���̸�, ����� %s�̰�, ���ʽ� ����Ʈ�� %d�Դϴ�.\n", customerName, customerAge, customerGrade, bonusPoint);
	}
	
	public void AccessLounge() {
		System.out.println("VIP���� ������� �����ϼ̽��ϴ�.");
	}
}
