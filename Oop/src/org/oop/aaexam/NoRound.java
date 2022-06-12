package org.oop.aaexam;

public class NoRound {

	public double Round(double num, int digits) {
		int mul = 1;
		for(int i=0; i<digits; i++) {
			System.out.println(i);
			mul *= 10;
		}
		
		num = num * mul;
		num += 0.5;
		int result = (int)num;
		return (double)result / mul;
		
	}
	
	public double round(double num, int digits) {
		
		double result = (int)(num * Math.pow(10, digits) + 0.5) / Math.pow(10, digits);
		return result;
	}
	
	public static void main(String[] args) {

		NoRound nr = new NoRound();
		
		double result = nr.Round(13.7999, 0);
		double result2 = nr.round(13.7999, 0);
		System.out.println(result);
		System.out.println(result2);
	}

}
