package com.levon.algorithms.searching;

public class BinarySearch {
	public static void main(String[] args) {
		int[] ar = new int[] {1,2,3,4,6};
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("555".length());
//		System.out.println();
//		int pos = bynarySearchRec(ar, 5, 0, ar.length-1);
//		System.out.println(pos);
	}
	
	public static int bynarySearchRec(int ar[], int x, int low, int high) {
		
		if(low > high) {
			return -1; // error;
		}
		
		int mid = (low+high)/2;
		
		if(ar[mid] == x) {
			return mid;
		}
		if(x > ar[mid]) {
			return bynarySearchRec(ar, x, mid+1, high);
		}
		else if(x < ar[mid]) {
			return bynarySearchRec(ar, x, low, mid-1);
		}
		else {
			return mid;
		}
		
	}
}
