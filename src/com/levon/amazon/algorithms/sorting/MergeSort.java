package com.levon.amazon.algorithms.sorting;

public class MergeSort {
	public static void main(String[] args) {
		int[] ar = new int[] {77, 0, 4, 7, 5, 1, 3, 55, 34, 3, -8 };
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		mergeSort(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}
	
	public static void mergeSort(int[] ar) {
		int n = ar.length;
		if(n < 2) {
			return;
		}
		int mid = n/2;
		int[] left = new int[mid];
		int[] right = new int[n-mid];
		for (int i = 0; i < left.length; i++) {
			left[i] = ar[i];
		}
		for (int i = 0; i < right.length; i++) {
			right[i] = ar[i+mid];
		}
		mergeSort(left);
		mergeSort(right);
		merge(left, right, ar);
	}
	
	public static void merge(int[] left, int[] right, int[] ar)  {
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < left.length && j < right.length) {
			if(left[i] <= right[j]) {
				ar[k] = left[i];
				i++;
			}
			else if(left[i] > right[j]) {
				ar[k] = right[j];
				j++;
			}
			k++;
		}
		while(i < left.length) {
			ar[k] = left[i];
			k++;
			i++;
		}
		while(j < right.length) {
			ar[k] = right[j];
			k++;
			j++;
		}
	}
}
