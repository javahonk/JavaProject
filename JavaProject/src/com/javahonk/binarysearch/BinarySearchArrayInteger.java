package com.javahonk.binarysearch;

import java.util.Arrays;

/**
 * Search element in array using Binary Search
 * @author Java Honk
 *
 */
public class BinarySearchArrayInteger {

	private final static int NOT_FOUND = -1;

	public static void main(String[] args) {

		int array[] = { 3, 10, 7, 1, 2, 20, 40, 19 };

		Arrays.sort(array);

		int value = binarySearch(array, 19);

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
	public static int binarySearch(int number[], int searchValue) {

		int low = 0;
		int high = number.length - 1;
		int mid = (low + high) / 2;

		while (low <= high && number[mid] != searchValue) {

			if (number[mid] < searchValue) {
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
