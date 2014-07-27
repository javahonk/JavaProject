package com.javahonk;

import java.util.ArrayList;
import java.util.List;

public class TokenizeString {

	public static void main(String[] args) {

		String string = "How now, Mrs. Brown Cow";
		char charArray[] = string.toCharArray();
		List<String> list = new ArrayList<String>();
		StringBuilder stringBuilder = new StringBuilder();
		int charLength = charArray.length;

		for (int i = 0; i < charLength; i++) {
			char c = charArray[i];

			if (c != ' ' && c != ',' && c != '.') {
				stringBuilder.append(c);
				if (i == charLength-1) {
					list.add(stringBuilder.toString());
				}
			} else {
				if (!stringBuilder.toString().equals("")) {
					list.add(stringBuilder.toString());
					stringBuilder = new StringBuilder();
				}

			}

		}

		System.out.println(list);

	}

}
