package collaboration;

public class Student {

	String studentName;
	int money;
	
	public Student(String studentName, int money) {	
		this.studentName = studentName;
		this.money = money;
	}
	
	public void TakeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void TakeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void ShowInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "원 입니다.");
	}
}
