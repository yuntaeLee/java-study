package org.oop.inheritance.homework;

public class Manager extends Employee{

	String jobId;
	
	public void overridingTest() {
		System.out.println("����� �̸��� " + name + "�̰� ���̴� " + age + "�Դϴ�.");
		System.out.println("���� ������ " + jobId + "�Դϴ�.");
	}
	
	public Manager(String j, int a, String n) {
		this.jobId = j;
		super.age = a;
		super.name = n;
	}
	
	public void show_info() {
		System.out.printf("%s(%d)�� ������ %s�Դϴ�.", super.name, super.age, this.jobId);
	}
}
