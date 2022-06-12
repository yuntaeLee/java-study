package org.oop.formatting;

import java.text.DecimalFormat;

public class Table {

	public static void main(String[] args) {

		System.out.printf("%7s %7s %7s\n", "Name", "Total", "Avg");
		System.out.printf("%7s %7d %7.2f\n", "Jones", 950, 80.2436);
		System.out.printf("%7s %7d %7.2f\n", "Tom", 1050, 90.43);
		
		// 돈 표시 (세자리 수당 ,를 표시)
		DecimalFormat formatter = new DecimalFormat("#,##0");
		int data = 1000000000;
		String ret = formatter.format(data);
		System.out.print("#,##0 - ");
		// 1,000,000,000
		System.out.println(ret);
		
		// 소수점 이하 2번째자리까지 표시 (소수점 이하가 없을 경우 0.00으로 표시한다.)
		DecimalFormat formatter2 = new DecimalFormat("#,##0.00");
		double data2 = 10000000d;
		ret = formatter2.format(data2);
		//10,000,000.00
		System.out.print("#,##0.00 - ");
		System.out.println(ret);
		
		// 소수점 이하 2번째자리까지 표시 (소수점 이하가 없을 경우 표시하지 않는다.)
		DecimalFormat formatter3 = new DecimalFormat("#,##0.##");
		ret = formatter3.format(data2);
		System.out.print("#,##0.## - ");
		// 1,000,000,000
		System.out.println(ret);
		
		double data3 = 1000.123d;
		System.out.print("#,##0.00 - ");
		ret = formatter2.format(data3);
		// 1,000.12
		System.out.println(ret);
		
		System.out.print("#,##0.## - ");
		ret = formatter3.format(data3);
		// 1,000.12
		System.out.println(ret);
		
		double data4 = 1000.1d;
		System.out.print("#,##0.00 - ");
		ret = formatter2.format(data4);
		// 1,000.10
		System.out.println(ret);
		
		System.out.print("#,##0.## - ");
		ret = formatter3.format(data4);
		// 1,000.1
		System.out.println(ret);

	}

}
