package org.oop.practice;

public class Dog {

	private String name;
	private char sex;
	private String color;
	private String phone;
	
	public Dog() {
		this.name = "멍멍이";
		this.sex = 'm';
		this.color = "흰색";
		this.phone = "000-0000-0000";
	}
	
	public Dog(String name, char sex, String color, String phone) {
		this.name = name;
		this.sex = sex;
		this.color = color;
		this.phone = phone;
	}
	
	public void show_info() {
		String new_sex;
		if (this.sex == 'm') {
			new_sex = "수컷";
		} else {
			new_sex = "암컷";
		}
		System.out.printf("이름: %s, 성별: %s, 색상: %s, 주인 핸드폰: %s\n", name, new_sex, color, phone);
	}
	
	public String show_name() {
		return this.name;
	}
	
	public void change_phone(String new_phone) {
		this.phone = new_phone;
	}
	
	
	public static void main(String[] args) {

		Dog d01 = new Dog();
		Dog d02 = new Dog("하니", 'f', "검은색", "010-1234-5678");
		d01.show_info();
		d02.show_info();
		d01.change_phone("010-2345-2345");
		d01.show_info();
		System.out.println(d02.show_name());
		
	}

}
