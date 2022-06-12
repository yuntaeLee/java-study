package lambda;

public class AddTest{

	public static void main(String[] args) {

		Add addL = (x, y)-> {return x+y;};
		Add addA = (x, y)-> x+y;
		System.out.println(addL.add(2, 3));
		System.out.println(addA.add(2, 3));
		
	}

}
