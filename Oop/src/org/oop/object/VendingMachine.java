package org.oop.object;

public class VendingMachine {
	
	static int WATER_PRICE;
	int cash;
	
	void insertCoin(int coin) {
		cash += coin;
		if( cash >= WATER_PRICE) {
			System.out.println("���� 1��");
			cash -= WATER_PRICE;
		}
		System.out.println("�ܵ�: " + cash);
	}
	
	public static void main(String[] args) {

		VendingMachine vm = new VendingMachine();
		vm.insertCoin(1000);
	}

}
