package com.javahonk.binarysearch;

import java.util.Arrays;

/**
 * Search element in array using Binary Search
 * @author Java Honk
 *
 */
public class BinarySearchArrayString {

	private final static int NOT_FOUND = -1;

	public static void main(String[] args) {

		String array[] = { "Z", "W", "E", "D", "Z", "A", "V", "W" };

		Arrays.sort(array);

		int value = binarySearch(array, "V");

		if (value == -1) {
			System.out.println("Search value not found");
		} else {
			System.out.println("Search value position: " + value);
		}

	}

	/**
	 * @param number
	 * @param searchValue
	 * @return
	 */
	public static int binarySearch(String number[], String searchValue) {

		int low = 0;
		int high = number.length - 1;
		int mid = (low + high) / 2;

		while (low <= high && !number[mid].equalsIgnoreCase(searchValue)) {

			if (number[mid].compareTo(searchValue) < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

			mid = (low + high) / 2;

			if (low > high) {
				mid = NOT_FOUND;
			}

		}
		return mid;

	}

}
