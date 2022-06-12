package org.oop.inheritance.homework;

public class Manager extends Employee{

	String jobId;
	
	public void overridingTest() {
		System.out.println("사원의 이름은 " + name + "이고 나이는 " + age + "입니다.");
		System.out.println("그의 직업은 " + jobId + "입니다.");
	}
	
	public Manager(String j, int a, String n) {
		this.jobId = j;
		super.age = a;
		super.name = n;
	}
	
	public void show_info() {
		System.out.printf("%s(%d)의 직업은 %s입니다.", super.name, super.age, this.jobId);
	}
}
