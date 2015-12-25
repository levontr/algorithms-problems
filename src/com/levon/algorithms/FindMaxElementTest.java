package com.levon.algorithms;

public class FindMaxElementTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = new int[]{2,84,4,815,3,6,77};
		System.out.println(findMaxElement(array));
	}

	public static int findMaxElement(int[] array) {
		int max = 0;
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;

	}

}
