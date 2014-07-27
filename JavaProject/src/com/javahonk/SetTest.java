package com.javahonk;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add(null);
		set.add("a");
		
		for (String string : set) {
			System.out.println(string);
		}

	}

}
