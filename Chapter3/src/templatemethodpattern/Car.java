package templatemethodpattern;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {} // hook method: 필요한 경우 Override
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
