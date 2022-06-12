package staticvar;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee empL = new Employee();
		empL.setEmployeeName("Lee");
		
//		System.out.println(empL.serialNum);
//		System.out.println(Employee.serialNum); // 변수는 클래스 이름으로 참조하여 사용
		System.out.println(Employee.getSerialNum());
		
		Employee empK = new Employee();
		empK.setEmployeeName("Kim");

		System.out.println(empL.getEmployeeName() + "님의 사번은 " + empL.getEmployeeId());
		System.out.println(empK.getEmployeeName() + "님의 사번은 " + empK.getEmployeeId());
	}

}
