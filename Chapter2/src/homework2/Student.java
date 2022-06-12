package homework2;

public class Student {
	
	String studentName;
	int money;
	
	Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void TakeTaxi(Taxi taxi) {
		taxi.Take(10000);
		this.money -= 10000;
	}
	
	public void ShowInfo() {
		System.out.println(studentName + "���� ���� ���� " + money + "�� �Դϴ�.");
	}

}
