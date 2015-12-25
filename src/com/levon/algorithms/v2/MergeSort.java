package com.levon.algorithms.v2;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] arr = new int[] { 77, 0, 4, 7, 5, 1, 3, 55, 34, 3, -8 };
		mergeSort(arr);
		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
	}

	public static void mergeSort(int[] arr) {
		if (arr.length < 2) {
			return;
		}
		int n = arr.length;
		int mid = (n) / 2;
		int[] left = new int[mid];
		int[] right = new int[n-mid];
		for (int i = 0; i < left.length; i++){
			left[i] = arr[i];
		}
		for (int i = 0; i < right.length; i++){
			right[i] = arr[mid+i];
		}
		mergeSort(left);
		mergeSort(right);
		concure(left, right, arr);
	}

	private static void concure(int[] left, int[] right, int[] arr) {
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<left.length && j<right.length) {
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while(i<left.length) {
			arr[k] = left[i];
			k++;
			i++;
		}
		while(j<right.length) {
			arr[k] = right[j];
			k++;
			j++;
		}
	}

}
