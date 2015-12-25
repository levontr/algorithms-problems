package com.levon.algorithms;

import javax.management.RuntimeErrorException;

public class FindMissedNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = new int[]{0,1,2,3,5};
		System.out.println(findMissedNumber(array));
	}

	public static int findMissedNumber(int[] array) {
		int sum = 0;
		int realSum = 0;
		for(int i=0; i<array.length; i++) {
			realSum+=array[i];
		}
		sum = (array.length+1)*array.length/2;
		return sum-realSum;
	}
}
