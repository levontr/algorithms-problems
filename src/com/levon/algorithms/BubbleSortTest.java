package com.levon.algorithms;

public class BubbleSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = insertionSort(new int[] { 77, 0, 4, 7, 5, 1, 3, 55, 34, 3, -8 });
		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}

	public static int[] bubbleSort(int[] arr) {
		int length = arr.length;
		for (int j = 0; j < arr.length - 1; ++j) {
			for (int i = 0; i < length - 1; ++i) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
			length--;
		}
		return arr;
	}

	public static int[] bubbleSort2(int[] a) {
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
	
	
	public static int[] insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				if(a[j] < a[j-1]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		return a;
	}
}
