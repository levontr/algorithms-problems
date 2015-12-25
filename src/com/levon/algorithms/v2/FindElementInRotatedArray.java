package com.levon.algorithms.v2;

public class FindElementInRotatedArray {

	public static int findElementInRotatedArray(int[] a, int x) {
		int n = a.length;
		int low = 0;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (x == a[mid]) { // case 1: we found element!
				return mid;
			}
			if (a[mid] <= a[high]) { // case 2: right half is sorted
				if (x > a[mid] && x <= a[high]) { // element is in right sorted
													// part of the array
					low = mid + 1;
				} else {
					high = mid - 1; // 
				}
			} else {
				if (x < a[mid] && x >= a[low]) { // search in the left sorted
												// part of the array
					high = mid - 1;
				} else {
					low = mid +1;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {12,15,18,22,25,35, 2, 4, 5, 8, 9, 10};
		//          {0, 1, 2, 3, 4, 5,  6, 7, 8, 9, 10,11};
		System.out.println(findElementInRotatedArray(arr, 15));
	}
}
