package org.oop.practice;

public class Human {

	private String name;
	private int age;
	private int weight;
	
	public Human() {
		this.name = "noname";
		this.age = 0;
		this.weight = 0;
	}
	
	public Human(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public void show_info() {
		System.out.printf("이름: %s, 나이: %d세, 몸무게: %dkg\n", name, age, weight);
	}
	
	public String show_name() {
		return name;
	}
	
	public void gain_weight(int w) {
		weight += w;
		System.out.printf("%s의 몸무게가 %dkg이 되었습니다.", name, weight);
		if (weight >= 100) {
			System.out.println("위험합니다. 체중을 줄이세요.");
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public static void main(String[] args) {
		Human h1 = new Human("홍길동", 20, 88);
		Human h2 = new Human();
		h1.show_info();
		h2.show_info();
		h1.gain_weight(20);
	}
	
}
