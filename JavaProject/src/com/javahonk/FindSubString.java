package com.javahonk;

public class FindSubString {

	public static void main(String[] args) {
		
		String value = "he hell hel hello world I am from heaven";		
		char valueArray[] = value.toCharArray();
		
		String subStringValue = "hello";
		char subStringArray[] = subStringValue.toCharArray();
		
		StringBuffer finalStringValue = new StringBuffer();
		
		int jIncrement = 0;
		
		//O(n) Brute Force algorithm 
		for (int i = 0; i < valueArray.length; i++) {
			char c = valueArray[i];
			
			for (int j=jIncrement; j < subStringArray.length;) {
				
				char s = subStringArray[j];
				if (c == s) {
					System.out.print(s);
					finalStringValue.append(s);
					jIncrement++;
					break;
				}else {
					break;
				}
				
			}
			
		}
		
		if (subStringValue.equalsIgnoreCase(finalStringValue.toString())) {
			System.out.println("\nSub stirng found");
		}else {
			System.out.println("\nSub stirng not found");
		}
		
		
	}


}
