package org.oop.inheritance;

public class Calculator {
	
	int x, y;
	
	int add() {
		return this.x + this.y;
	}
	
	int sub() {
		return this.x - this.y;
	}
	
	int mul() {
		return this.x * this.y;
	}
	
	int div() {
		return x/y;
	}
	
	public Calculator(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
