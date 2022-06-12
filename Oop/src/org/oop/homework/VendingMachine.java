package org.oop.homework;

public class VendingMachine {

	final int WATER_PRICE = 800;
	int cash;
	int waterCount;
	
	void insertCoin(int coin) {
		cash += coin;
		System.out.println(coin + "원을 투입하셨습니다.");
		checkedCoin();
	}
	
	void checkedCoin() {
		System.out.println("현재 주문 가능한 금액은 " + cash + "원 입니다.");
	}
	
	void loadWater(int w) {
		int returnWaterCount;
		if ( w >= 0 ) {
			if (waterCount + w <= 100) { // 최대 적재 수량 100개
				waterCount += w;
				System.out.println(w + "개의 생수가 적재 되었습니다.");
				checkedWaterCount();
			} else {
				returnWaterCount = (waterCount + w) - 100;
				waterCount = 100;
				System.out.println("최대 적재수량은 100개 입니다. 나머지 " + returnWaterCount + "개의 생수는 자동반출 되었습니다.");
				checkedWaterCount();
			} 	
		} else {
			System.out.println("- 개의 수량은 입력할 수 없습니다.");
		}
	}
	
	void checkedWaterCount() {
		if (waterCount > 0) System.out.println("남은 생수 재고: " + waterCount);
		else System.out.println("재고없음");
	}
	
	void selectWater() {
		if( cash >= WATER_PRICE && waterCount > 0) {
			cash -= WATER_PRICE;
			waterCount -= 1;
			System.out.println("생수 나옴");	
		} else if ( waterCount <= 0 ) {
			checkedWaterCount();
		} else {
			System.out.println("돈을 추가로 투입해주세요.");
			checkedCoin();
		}
		
	}
	
	void takeOutChange() {
		System.out.println("잔돈 " + cash + "원을 인출하였습니다.");
		cash = 0;
	}
	
	static void printStdNumber() {
		System.out.println("60161069 이윤태\n");
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
