package com.javahonk.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchArrayListInteger {

	private final static int NOT_FOUND = -1;

	public static void main(String[] args) {

		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(3);
		integerList.add(10);
		integerList.add(7);
		integerList.add(1);
		integerList.add(2);
		integerList.add(20);
		integerList.add(40);
		integerList.add(19);
				

		Collections.sort(integerList);

		int value = binarySearch(integerList, 19);

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
	public static int binarySearch(List<Integer> integerList, int searchValue) {

		int low = 0;
		int high = integerList.size() - 1;
		int mid = (low + high) / 2;

		while (low <= high && integerList.get(mid) != searchValue) {

			if (integerList.get(mid) < searchValue) {
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
