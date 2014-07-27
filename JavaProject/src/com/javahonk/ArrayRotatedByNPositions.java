package com.javahonk;

public class ArrayRotatedByNPositions {

	public static void main(String[] args) {

		int input[] = { 1, 2, 3, 4, 5, 6 };
		int output[] = new int[input.length];
		System.out.println("Test");
		
		//Input number
		int N = 2;
		
		int outPutNvalue = N;

		for (int i = 0; i < input.length; i++) {
			int value = input.length - N;
			if (N != 0) {
				output[i] = input[value];
				N--;
			} else {
				output[i] = input[i - outPutNvalue];
			}
			
		}

		for (int i = 0; i < output.length; i++) {
			int j = output[i];
			System.out.print(j+" ");
			
		}

	}

}
