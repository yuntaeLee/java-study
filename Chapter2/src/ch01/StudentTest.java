package ch01;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "���� ���빮��";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "��⵵";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee); // reference value heap�� �ּ�
		System.out.println(studentKim);
		
	}
	

}
