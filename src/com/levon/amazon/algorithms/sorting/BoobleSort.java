package com.levon.amazon.algorithms.sorting;

public class BoobleSort {
	
	public static void main(String[] args) {
		int[] ar = new int[] {77,2,3,44,6,1,4,8};
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < ar.length; i++) {
			int temp;
			for (int j = 1; j < ar.length-i; j++) {
				if(ar[j-1] > ar[j]) {
					temp = ar[j];
					ar[j] = ar[j-1];
					ar[j-1] = temp;
				}
				
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
