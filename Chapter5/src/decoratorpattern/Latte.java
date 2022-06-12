package decoratorpattern;

public class Latte extends Decorator{

	// ���� Ŭ������ default �����ڰ� ���� ������ super ����
	public Latte(Coffee coffee) {
		super(coffee);
	}
	
	public void brewing() {
		super.brewing();
		System.out.print(" Adding Milk ");
	}

}
