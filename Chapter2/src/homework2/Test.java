package homework2;

public class Test {

	public static void main(String[] args) {

		Student studentE = new Student("Edward", 20000);
		Taxi TaxiJ = new Taxi("�߳����� ����ý�");
		
		studentE.TakeTaxi(TaxiJ);
		
		studentE.ShowInfo();
		TaxiJ.ShowTaxiInfo();
		
	}

}
