package com.levon.algorithms.dynamicprogramming;

/**
 * Find a subsequence in given array in which the subsequence's elements are 
 * in sorted order, lowest to highest, and in which the subsequence is as long as possible
 * 
 * Solution : 
 * Dynamic Programming is used to solve this question. DP equation is 
 * if(arr[i] > arr[j]) { T[i] = max(T[i], T[j] + 1 }
 * 
 * Time complexity is O(n^2).
 * Space complexity is O(n)
 * 
 * @author Levon
 *
 */

public class LongestIncreasingSubsequence {

	public static int findLongestIncreasingSubsequence(int[] arr) {
		int n = arr.length;
		int[] temp = new int[n];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = 1;
		}
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && temp[i] < temp[j] + 1) {
					temp[i] = temp[j] + 1;
				}
			}
		}
		int max = 0;
		for (int i = 1; i < n; i++) {
			if (temp[i] > temp[max]) {
				max = i;
			}
		}
		return temp[max];
	}

	public static void main(String[] args) {
		int[] input = { 4, 1, 2, 3, 7, 5, 6 };
		System.out.println(findLongestIncreasingSubsequence(input));
	}
	
//	public static int findLongestIncreasingSubsequenceRecursive(int[] arr, int n) {
//		if(n == 1) {
//			return 1;
//		}
//		findLongestIncreasingSubsequenceRecursive(arr, n-1);
//		
//		return max;
//	}
//	}
}
