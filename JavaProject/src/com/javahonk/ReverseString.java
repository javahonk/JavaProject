package com.javahonk;

public class ReverseString {

	public static void main(String[] args) {

		String reverseString = "Hello World";
		char charArray[] = reverseString.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = charArray.length - 1; i >= 0; i--) {
			char c = charArray[i];
			stringBuilder.append(c);
		}

		System.out.println(stringBuilder.toString());

	}

}
