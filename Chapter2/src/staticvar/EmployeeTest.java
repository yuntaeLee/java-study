package staticvar;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee empL = new Employee();
		empL.setEmployeeName("Lee");
		
//		System.out.println(empL.serialNum);
//		System.out.println(Employee.serialNum); // ������ Ŭ���� �̸����� �����Ͽ� ���
		System.out.println(Employee.getSerialNum());
		
		Employee empK = new Employee();
		empK.setEmployeeName("Kim");

		System.out.println(empL.getEmployeeName() + "���� ����� " + empL.getEmployeeId());
		System.out.println(empK.getEmployeeName() + "���� ����� " + empK.getEmployeeId());
	}

}
