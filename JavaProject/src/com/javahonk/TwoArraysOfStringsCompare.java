package com.javahonk;

public class TwoArraysOfStringsCompare {

	public static void main(String[] args) {

		String[] a = { "dog", "cat", "monkey" };
		String[] b = { "cat", "rat", "dog", "monkey" };
		StringBuilder stringBuilder = new StringBuilder();

		for (String string : a) {
			stringBuilder.append(string + " ");
		}

		for (String string : b) {

			if (!stringBuilder.toString().contains(string)) {
				System.out.println("Extra animal contains in b: "
								+ string);
			}

		}

	}

}
