package com.levon.amazon.algorithms.sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] ar = new int[] {77,2,3,44,6,4,8, 1};
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < ar.length; i++) {
			int temp;
			int index = i;
			for (int j = i+1; j < ar.length; j++) {
				if(ar[j] < ar[index]) {
					index = j;
				}
			}
			temp = ar[i];
			ar[i] = ar[index];
			ar[index] = temp;
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}
}
