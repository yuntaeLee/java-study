package decoratorpattern;

public class WippingCream extends Decorator{

	public WippingCream(Coffee coffee) {
		super(coffee);
	}
	
	public void brewing() {
		super.brewing();
		System.out.print(" Adding Wipping Cream ");
	}
	

}
