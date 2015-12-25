package com.levon.algorithms.v2;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = insertionSort(new int[] { 77, 0, 4, 7, 5, 1, 3, 55, 34, 3, -8 });
		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}

	public static int[] insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}
		return a;
	}
}
