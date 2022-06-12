package collaboration;

public class TakeTransTest {

	public static void main(String[] args) {

		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		studentJ.TakeBus(bus100);
		
		Subway greenSubway = new Subway(2);
		
		studentT.TakeSubway(greenSubway);
		
		studentJ.ShowInfo();
		studentT.ShowInfo();
		
		bus100.ShowBusInfo();
		greenSubway.ShowSubwayInfo();
		bus500.ShowBusInfo();
		
	}

}
