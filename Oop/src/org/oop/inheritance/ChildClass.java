package org.oop.inheritance;

public class ChildClass extends ParentClass{
	
	String son, daughter;
	
	public ChildClass(String s, String d) {
		this.son = s;
		this.daughter = d;
	}
	
	public ChildClass() {
//		this.son = "son";
//		this.daughter = "daughter";
		this("son", "daughter");
	}
	
	public String toString() {
//		return super.father + "/" + super.mother + "/" + this.son + "/" + this.daughter;
		return super.toString() + "/" + son + "/" + daughter;
	}
	
	public static void main(String[] args) {
		ParentClass pc = new ParentClass();
		System.out.println(pc.toString());
		
		ChildClass cc = new ChildClass();
		System.out.println(cc.toString());
		
	}
	
}
