package com.levon.algorithms.sorting.questions;

public class FindElementInRotatedArray {
	public static void main(String[] args) {
		int[] ar = new int[]{5,6,1,2,3,4};
		int pos = search(ar, 0, ar.length-1, 4);
		System.out.println(pos);
	}
	
	public static int search(int[] ar, int left, int right, int x) {
		if(left > right) {
			return -1;
		}
		int mid = (left + right)/2;
		if(x == ar[mid]) {
			return mid;
		}
		if(ar[left] < ar[mid]) {
			if(x <= ar[mid] && x >= ar[left]) {
				return search(ar, left, mid-1, x);
			} else {
				return search(ar, mid+1, right, x);
			}
		}
		else if(ar[right] > ar[mid]) {
			if(x >= ar[mid] && x <= ar[right]) {
				return search(ar, mid+1, right, x);
			}
			else {
				return search(ar, mid-1, left, x);
			}
		}
		return -1;
		
		
	}
}
