package com.levon.amazon.algorithms.sorting;

public class InsertionSort {

	public static void main(String[] args) {

		insertionSortTest(new int[] { 6, 8, 3, 5, 9, 1, 2 });
	}

	public static void insertionSortTest(int[] num) {
		int j; // the number of items sorted so far
		int key; // the item to be inserted
		int i;

		for (j = 1; j < num.length; j++) // Start with 1 (not 0)
		{
			key = num[j];
			for (i = j - 1; (i >= 0) && (num[i] < key); i--) // Smaller values
																// are moving up
			{
				num[i + 1] = num[i];
			}
			num[i + 1] = key; // Put the key in its proper location
		}
	}
}