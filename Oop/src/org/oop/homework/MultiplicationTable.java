package org.oop.homework;

public class MultiplicationTable {
	
	private int[][] arr;

	public static void printStdNumber() {
		System.out.println("60161069 юлю╠еб");
	}
	
	public int[][] makeMultiplicationTable(int r, int c) {
		this.arr = new int[r][c];
		for(int i = 0; i < arr.length; i++ ) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i+1) * (j+1);
			}
		}
		return arr;
	}
	
	public String toString() {
		String result = "";
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				result += arr[row][col] + " ";	
			}
			result += "\n";
		}
		return result;
	}
	
	public static void main(String[] args) {
		MultiplicationTable MultiplicationTable = new MultiplicationTable();
		printStdNumber();
		MultiplicationTable.makeMultiplicationTable(9, 9);
		System.out.println(MultiplicationTable);
	}
}
