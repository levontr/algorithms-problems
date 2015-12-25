package com.levon.algorithms;

import java.util.HashMap;
import java.util.Map;

public class FindMissedNumberInSecondArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array1 = {1,2,3,4,5,6,7,8};
		int[] array2 = {1,2,3,6,7,8};
		int[] missedElements = findNumbers(array1, array2);
		for(int  i=0; i<missedElements.length; i++) {
			System.out.println(missedElements[i]);
		}
	}
	public static int[] findNumbers(int[] array1, int[] array2) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] missedElements = new int[array1.length-array2.length];
		for(int i=0; i<array2.length; i++) {
			map.put(array2[i], i);
		}
		int j=0;
		for(int i=0; i<array1.length; i++) {

			if(map.get(array1[i]) == null) {
				missedElements[j] = array1[i];
				j++;
			}

		}
		return missedElements;
	}

}
