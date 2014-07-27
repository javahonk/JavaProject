package com.javahonk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStringByLength implements Comparator<String> {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("aghkafgklt2");
		list.add("dfghako");
		list.add("qwemnaarkf");

		Collections.sort(list, new SortStringByLength());
		for (String string : list) {
			System.out.println(string);
		}

	}

	@Override
	public int compare(String o1, String o2) {

		return o1.length() - o2.length();
	}

}
