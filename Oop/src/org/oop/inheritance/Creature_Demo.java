package org.oop.inheritance;

public class Creature_Demo {

	public static void main(String[] args) {

		Animal a = new Animal();
		Plant p = new Plant();
		
		a.num_of_legs = 4;
		a.size = 3;
		p.size = 10;
		p.breathe();
		a.breathe();
	}

}
