package com.levon.algorithms;

public class CheckIfThereAreCommonPartBetweenTwoArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array1 = new int[]{1,2,3,4,5,6};
		int[] array2 = new int[]{4,5,6,7,8,9};
		int[] commonPart = retrieveCommonPartOfTwoArrays(array1, array2);
		for(int i=0; i<commonPart.length; i++) {
			System.out.println(commonPart[i]);
		}

	}
	public static int[] retrieveCommonPartOfTwoArrays(int[] array1, int[] array2) {
		int[] commonPart = new int[(array1.length > array2.length?array2.length:array1.length)];
		for(int i=array1.length-1, j=0; j<commonPart.length; j++, i--) {
			if(array1[i] == array2[j]) {
				commonPart[j] = array1[j];
			}
			else
				break;
		}
		return commonPart;
	}

	public static boolean isSubstring(int[] largeArray, int[] subArray) {

		if (largeArray.length == 0 || subArray.length == 0) {
			return false;
		}
		if (largeArray.length < subArray.length) {
			return false;
		}
//		startOver:
			for (int i = 0; i < largeArray.length; i++) {
			if (largeArray[i] == subArray[0]) {
				int k = i;
				for (int j = 1; j < subArray.length; j++) {
					if (largeArray[++k] != subArray[j]) {
//						continue startOver;
					}
				}
				return true;
			}
		}
		return false;

	}

}
