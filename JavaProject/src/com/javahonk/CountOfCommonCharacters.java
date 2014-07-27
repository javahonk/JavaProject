package com.javahonk;

import java.util.HashSet;
import java.util.Set;

public class CountOfCommonCharacters {
	public static void main(String[] args) {

		String first = "aghkafgklt";
		String first2 = "dfghako";
		String first3 = "qwemnaarkf";

		char array1[] = first.toCharArray();
		Set<String> set = new HashSet<String>();

		for (int i = 0; i < array1.length; i++) {
			char c = array1[i];
			if (first.indexOf(c) != -1 && first2.indexOf(c) != -1
					&& first3.indexOf(c) != -1) {
				set.add(String.valueOf(c));
			}

		}

		System.out.println("Common characters present in string");
		for (String string : set) {
			System.out.println(string);
		}

	}
}
