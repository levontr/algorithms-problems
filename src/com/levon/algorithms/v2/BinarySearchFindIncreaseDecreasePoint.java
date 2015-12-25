package com.levon.algorithms.v2;

public class BinarySearchFindIncreaseDecreasePoint {

	public static int findPivot(int[] a) {
		int low = 0;
		int high = a.length-1;
		int n = a.length;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int prev = (mid + n - 1) % n;
			int next = (mid + 1) % n;
			if (a[mid] >= a[next] && a[mid] >= a[prev]) {
				return mid;
			}
			if (a[mid] > a[high]) {
				high = mid - 1;
			} else if (a[mid] >= a[low]) {
				low = mid+1;
			}
		}
		return -1;

	}
	public static void main(String[] args) {
		int[] a = {1,2,3,5,8,12,17, 20,18,17,16};
		System.out.println(findPivot(a));
	}

}
