package com.levon.algorithms.dynamicprogramming;

public class MinimumJumpToReachEnd {

	public static int findMinimumJumpToReachEnd(int[] a) {
		int[] T = new int[a.length];
		T[0] = 0;
		for (int i = 1; i < T.length; i++) {
			T[i] = Integer.MAX_VALUE-1;
		}
		for (int i = 1; i < T.length; i++) {
			for (int j = 0; j < i; j++) {
				if(i <= j + a[j]) {
					T[i] = Math.min(T[i], T[j]+1);
				}	
			}
		}
		return T[T.length-1];
	}
	
	public static void main(String[] args) {
		int[] a = {2,3,1,1,2,4,2,0,1,1};
		System.out.println(findMinimumJumpToReachEnd(a));
	}
}
