package org.oop.practice;

public class Hstudent extends Human {
	
	private String std_no;
	
	public Hstudent(String name, int age, int weight ,String std_no) {
		super(name, age, weight);
		this.std_no = std_no;
	}
	
	public Hstudent() {
		this.std_no = "60200000";
		
	}
	
	public void study(int h) {
		System.out.printf("%s���� %d�ð����� �����߽��ϴ�.", super.getName(), h);
	}
	
	public static void main(String[] args) {
		Hstudent s1 = new Hstudent("ȫ�浿", 20, 88, "60191234");
		Hstudent s2 = new Hstudent();
		s1.show_info();
		s2.show_info();
		s1.study(3);
	}

}
