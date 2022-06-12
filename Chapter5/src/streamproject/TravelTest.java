package streamproject;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {

		TravelCustomer customerLee = new TravelCustomer("�̼���", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("������", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("ȫ�浿", 13, 50);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("�� ��� ���");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.print(s + " "));
		
		System.out.println();
		System.out.println("������");
		System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum());
		
		System.out.println();
		System.out.println("20�� �̻� ���̸� ����");
		customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.print(s + " "));;
		
	}

}
