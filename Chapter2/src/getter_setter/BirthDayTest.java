package getter_setter;

public class BirthDayTest {

	public static void main(String[] args) {

		BirthDay date = new BirthDay();
		
		date.setYear(2019);
		date.setMonth(12);
		date.setDay(1);

		date.showDate();
	}

}
