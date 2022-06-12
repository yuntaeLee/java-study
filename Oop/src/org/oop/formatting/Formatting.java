package org.oop.formatting;

public class Formatting {

	public static void main(String[] args) {
		
		//�ڸ��� ������ �� ���� ��� �������� ���ĵȴ�.
		System.out.printf("�ڸ��� ������ :%d%n",1);
		System.out.printf("�ڸ��� ������ :%d%n",10);
		System.out.printf("�ڸ��� ������ :%d%n",100);
		System.out.printf("�ڸ��� ������ :%d%n",1000);
		
		//�ڸ��� �������� ��� ���������� ���ĵȴ�.
		System.out.printf("�ڸ��� ���� :%4d%n",1);
		System.out.printf("�ڸ��� ���� :%4d%n",10);
		System.out.printf("�ڸ��� ���� :%4d%n",100);
		System.out.printf("�ڸ��� ���� :%4d%n",1000);
		
		//�ڸ��� ���� �� '-'����ϸ� �������� ���ĵȴ�.
		System.out.printf("�ڸ��� ����('-'���) :%-4d%n",1);
		System.out.printf("�ڸ��� ����('-'���) :%-4d%n",10);
		System.out.printf("�ڸ��� ����('-'���) :%-4d%n",100);
		System.out.printf("�ڸ��� ����('-'���) :%-4d%n",1000);
		
		//�ڸ��� ���� �� '0'����ϸ� ���������� ���ĵȴ�.
		System.out.printf("�ڸ��� ����('0'���) :%04d%n",1);
		System.out.printf("�ڸ��� ����('0'���) :%04d%n",10);
		System.out.printf("�ڸ��� ����('0'���) :%04d%n",100);
		System.out.printf("�ڸ��� ����('0'���) :%04d%n",1000);
		
		System.out.println(String.format("%d + %d �� %d �Դϴ�.", 10, 20, 30));
		System.out.printf("%d + %d �� %d �Դϴ�.", 10, 20, 30);
		
		// �ڸ���
		// �÷���'-' ������ ������ ����
		System.out.printf("\n%5d, %-8s, %10f\n", 10, "�ȳ�", 3.5);
		System.out.println();
		
		//
		System.out.printf("%-5s %8s %8s\n", "Name", "Total", "Avg");
		System.out.printf("%-5s %8d %8.2f\n", "Jones", 950, 80.2436);
		System.out.printf("%-5s %8d %8.2f\n", "Tom", 1050, 90.43);
		
		for( int i = 1; i < 17; i++ ) {
			System.out.printf("%3d", i);
			if ( i % 4 == 0 ) {
				System.out.println();
			}
		}
	}

}
