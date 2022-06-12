package ch12;

public class PersonTest {

	public static void main(String[] args) {
		
		Person np = new Person();
		np.showPerson();
		
		Person p = new Person();
		p.name = "James";
		p.age = 37;
		p.showPerson();
		
		// 메모리 주소가 같다.
		Person p2 = p.getPerson();
		System.out.println(p);
		System.out.println(p2);
		
		
	}


}
