package com.javahonk;

public class EqualityCheck {

	public static void main(String[] args) {
		int a = 5 ;
		int b = 5 ;
		
		if (a == b) {
			System.out.println("True");
		}

		String c = "Hello";
		String d= "Hello";
		
		if (c == d) {
			System.out.println("True");
		}
		
		if (c.equals(d)) {
			System.out.println("True");
		}
	}

}
