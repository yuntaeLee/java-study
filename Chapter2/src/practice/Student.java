package practice;

import java.util.ArrayList;

public class Student {
	
	int studentId;
	String studentName;
	
	ArrayList<Subject> subjectList;
	
	Student(int studentId, String studentName) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String name, int point) {
		Subject subject = new Subject();
		
		subject.setName(name);
		subject.setPoint(point);
		
		subjectList.add(subject);
	}
	
	public void showScoreInfo() {
		
		int total = 0;
		for( Subject subject : subjectList) {
			total += subject.getPoint();
			System.out.println(studentName + "�л��� " + subject.getName() + "������ ������" + subject.getPoint() + "�Դϴ�.");
		}
		
		System.out.println(studentName + "�л��� ������ " + total + "�Դϴ�.");
		
		
	}

}
