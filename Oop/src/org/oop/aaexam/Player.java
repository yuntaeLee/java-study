package org.oop.aaexam;

public class Player implements Attackable, Defendable{

	@Override
	public void defend() {
		System.out.println("방어");
	}

	@Override
	public void attack() {
		System.out.println("공격");
	}
	
	
	public static void main(String[] args) {
		
		Player p1 = new Player();
		p1.defend();
		p1.attack();
		System.out.println(p1.number);
	}
}
