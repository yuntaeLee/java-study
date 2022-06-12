package org.oop.week6.homework;

public class Overloading {
	
	// 60161069 ÀÌÀ±ÅÂ
	int add(int a, int b) { return a+b; }
	double add(double a, double b) { return a+b; }
	double add(int a, double b) { return a+b; }
	double add(double a, int b) { return a+b; }

}
