package org.oop.interface1.homework;

interface PlusMinus {
	int plus(int x, int y);
	int minus(int x, int y);
}

interface MulDiv {
	int mul(int x, int y);
	double div(int x, int y);
}

public class Calculator implements PlusMinus, MulDiv{
	
	@Override
	public int mul(int x, int y) {
		return x * y;
	}
	
	@Override
	public double div(int x, int y) {
		return x / y;
	}
	
	@Override
	public int plus(int x, int y) {
		return x + y;
	}
	
	@Override
	public int minus(int x, int y) {
		return x - y;
	}

	public static void main(String[] args) {
		System.out.println("60161069 ÀÌÀ±ÅÂ");
		Calculator c = new Calculator();
		System.out.println(c.plus(2, 3));
		System.out.println(c.minus(3, 2));
		System.out.println(c.mul(5, 10));
		System.out.println(c.div(10, 5));
	}
}
