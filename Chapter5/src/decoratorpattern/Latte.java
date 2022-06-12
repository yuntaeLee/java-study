package decoratorpattern;

public class Latte extends Decorator{

	// 상위 클래스의 default 생성자가 없기 때문에 super 생성
	public Latte(Coffee coffee) {
		super(coffee);
	}
	
	public void brewing() {
		super.brewing();
		System.out.print(" Adding Milk ");
	}

}
