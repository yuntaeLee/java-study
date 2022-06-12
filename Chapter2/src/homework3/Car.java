package homework3;

public class Car {
	
	private static int serialNum = 10000;
	private int carNumber;
	
	public Car() {
		serialNum++;
		carNumber = serialNum;
	}
	
	public int getCarNum() {
		return carNumber;
	}
	
	public void setCarNum(int carNumber) {
		this.carNumber = carNumber;
	}
}
