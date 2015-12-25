package com.levon.algorithms.dynamicprogramming;

public class CountBinarySearchTree {

	public static int countBST(int n) {
		int[] T = new int[n+1];
		T[0] = 1;
		T[1] = 1;
		for (int i = 2; i < T.length; i++) {
			for (int j = 0; j < i; j++) {
				T[i] += T[j]*T[i-j-1];
			}
		}
		return T[n];
	}
	public static void main(String[] args) {
		System.out.println(countBST(5));
	}
}
