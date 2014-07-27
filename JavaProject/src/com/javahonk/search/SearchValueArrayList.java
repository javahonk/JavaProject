package com.javahonk.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchValueArrayList {

	public static void main(String[] args) {

		List<String> integerList = new ArrayList<String>();
		integerList.add("Z");
		integerList.add("W");
		integerList.add("E");
		integerList.add("D");
		integerList.add("Z");
		integerList.add("A");
		integerList.add("V");
		integerList.add("W");

		Collections.sort(integerList);
		
		System.out.println(integerList.indexOf("V"));

	}

}
