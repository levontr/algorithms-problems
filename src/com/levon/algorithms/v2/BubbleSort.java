package com.levon.algorithms.v2;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = bubbleSort(new int[] { 77, 0, 4, 7, 5, 1, 3, 55, 34, 3, -8 });
		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}

	public static int[] bubbleSort(int[] a) {
		int n = a.length;
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
	
}
