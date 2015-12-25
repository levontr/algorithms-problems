package com.levon.algorithms.v2;

public class BinarySearchFirstLastOcurrance {

	public static int binarySearchRecursive(int[] a, int x, int high, int low) {

		if (low > high) {
			return -1;
		}
		int mid = (low + high) / 2;
		if (x == a[mid]) {
			return mid;
		}
		if (x > a[mid]) {
			low = mid + 1;
		} else {
			high = mid - 1;
		}
		return binarySearchRecursive(a, x, high, low);
	}

	public static int binarySearchIteration(int[] a, int x) {
		int high = a.length - 1;
		int low = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (x == a[mid]) {
				return mid;
			} else {
				if (x < a[mid]) {
					low = mid - 1;
				} else {
					high = mid + 1;
				}
			}
		}
		return -1;
	}

	public static int binarySearchFirst(int[] a, int x) {
		int high = a.length - 1;
		int low = 0;
		int result = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (x == a[mid]) {
				result = mid;
				high = mid - 1;
			} else {
				if (x < a[mid]) {
					low = mid - 1;
				} else {
					high = mid + 1;
				}
			}
		}
		return result;
	}

	public static int binarySearchLastFirst(int[] a, int x, boolean flag) {
		int high = a.length - 1;
		int low = 0;
		int result = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (x == a[mid]) {
				result = mid;
				if (flag) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}

			} else {
				if (x < a[mid]) {
					low = mid - 1;
				} else {
					high = mid + 1;
				}
			}
		}
		return result;
	}

}
