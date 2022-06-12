package org.oop.aaexam;

public class ElectricProduct extends Product{

	int voltage;

	@Override
	public void operate() {
		System.out.println(voltage+"볼트에서 동작합니다.");
	}
	
}
