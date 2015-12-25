package com.levon.algorithms.v2;

public class FindRotationsInSortedArray {
	
	public int findRotations(int[] arr) {
		int n = arr.length;
		int low = 0;
		int high = n-1;
		
		
		while(low<=high) {
			if(arr[low] < arr[high]) {
				return low;
			}
			int mid = (low+high)/2;
			int prev = (mid+n-1)%n;
			int next = (mid+1)%n;
			if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]) {
				return mid;
			}
			if(arr[mid] <= arr[high]) {
				high = mid-1;
			} else if(arr[mid] >= arr[low]) {
				low = mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {12,15,18,22,25,35, 2, 4, 5, 8, 9, 10};
		//          {0, 1, 2, 3, 4, 5,  6, 7, 8, 9, 10,11};
		System.out.println(new FindRotationsInSortedArray().findRotations(arr));
	}

}
