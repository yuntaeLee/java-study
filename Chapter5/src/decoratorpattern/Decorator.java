package decoratorpattern;

// 상속을 하기위한 상위클래스로만 사용하기 위해 abstract 선언
public abstract class Decorator extends Coffee{

	Coffee coffee;
	
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {
		coffee.brewing();
	}
	
	

}
