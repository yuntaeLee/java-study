package org.oop.homework;

public class VendingMachine {

	final int WATER_PRICE = 800;
	int cash;
	int waterCount;
	
	void insertCoin(int coin) {
		cash += coin;
		System.out.println(coin + "���� �����ϼ̽��ϴ�.");
		checkedCoin();
	}
	
	void checkedCoin() {
		System.out.println("���� �ֹ� ������ �ݾ��� " + cash + "�� �Դϴ�.");
	}
	
	void loadWater(int w) {
		int returnWaterCount;
		if ( w >= 0 ) {
			if (waterCount + w <= 100) { // �ִ� ���� ���� 100��
				waterCount += w;
				System.out.println(w + "���� ������ ���� �Ǿ����ϴ�.");
				checkedWaterCount();
			} else {
				returnWaterCount = (waterCount + w) - 100;
				waterCount = 100;
				System.out.println("�ִ� ��������� 100�� �Դϴ�. ������ " + returnWaterCount + "���� ������ �ڵ����� �Ǿ����ϴ�.");
				checkedWaterCount();
			} 	
		} else {
			System.out.println("- ���� ������ �Է��� �� �����ϴ�.");
		}
	}
	
	void checkedWaterCount() {
		if (waterCount > 0) System.out.println("���� ���� ���: " + waterCount);
		else System.out.println("������");
	}
	
	void selectWater() {
		if( cash >= WATER_PRICE && waterCount > 0) {
			cash -= WATER_PRICE;
			waterCount -= 1;
			System.out.println("���� ����");	
		} else if ( waterCount <= 0 ) {
			checkedWaterCount();
		} else {
			System.out.println("���� �߰��� �������ּ���.");
			checkedCoin();
		}
		
	}
	
	void takeOutChange() {
		System.out.println("�ܵ� " + cash + "���� �����Ͽ����ϴ�.");
		cash = 0;
	}
	
	static void printStdNumber() {
		System.out.println("60161069 ������\n");
	}
	
	public static void main(String[] args) {
		printStdNumber();
		VendingMachine vm = new VendingMachine();
		vm.insertCoin(1000);
		vm.loadWater(3);
		vm.selectWater();
		vm.selectWater();
		vm.insertCoin(5000);
		vm.selectWater();
		vm.selectWater();
		vm.selectWater();
		vm.loadWater(1000);
		vm.selectWater();
		vm.takeOutChange();
	}
}
