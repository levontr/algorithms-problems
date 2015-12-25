package com.levon.amazon.algorithms.sorting;

public class QuickSort {
	public static void main(String[] args) {
		int[] ar = new int[] {77,1,4,8};
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		quickSort(ar, 0, ar.length-1);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}
	public static void quickSort(int[] ar, int low, int high) {
		
		if (ar == null || ar.length == 0)
			return;
		if (low >= high)
			return;
		int middle = (high+low)/2;
		int pivot = ar[middle];
		int i = low;
		int j = high;
		while(i<=j) {
			while(ar[i] < pivot) {
				i++;
			}
			while(ar[j] > pivot) {
				j--;
			}
			if(i <= j) {
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
				i++;
				j--;
			}
		}
		if(low < j) {
			quickSort(ar, low, j);
		}
		if(high > i) {
			quickSort(ar, i, high);
		}
		
	}
}
