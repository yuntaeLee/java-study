package ch02;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	// default constructor
	public Student() {}
	
	// constructor
	public Student(int studentNumber, String studentName, int grade) {
		
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		
		return studentName + "�л��� �й��� " + studentNumber + "�̰�, " + grade + "�г� �Դϴ�.";
	}
}
