package com.javahonk.splitstring;

import java.util.ArrayList;
import java.util.List;

public class SplitStringMultipleDelimeters {

	public static void main(String[] args) {

		String demo = "This%^$is()*Test::;;Of!@String";

		String stringArray[] = demo.split("[//\n,!.?:;@#$%^&*()_+=?'<>+]");
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < stringArray.length; i++) {

			String string = stringArray[i];

			if (null != string && !string.equals("")) {

				list.add(string);

			}

		}

		// Print value
		for (String string : list) {
			System.out.println(string);
		}

	}

}
