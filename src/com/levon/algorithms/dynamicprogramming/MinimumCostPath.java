package com.levon.algorithms.dynamicprogramming;

public class MinimumCostPath {

	public static int findMinimumCostPath(int a[][]) {
		int n = a.length;
		int m = a[0].length;
		int[][] T = new int[n][m];
		int sum = 0;
		for (int i = 0; i < T.length; i++) {
			T[i][0] = sum+a[i][0];
			sum = T[i][0];
		}
		sum = 0;
		for (int i = 0; i < T[0].length; i++) {
			T[0][i] = sum+a[0][i];
			sum = T[0][i];
		}
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				T[i][j] = Math.min(T[i-1][j], T[i][j-1]) + a[i][j];
			}
		}
		return T[n-1][m-1];
	}
	
	public static void main(String[] args) {
		int[][] a = {{1,3,5,8}, {4,2,1,7}, {4,3,2,3}};
		System.out.println(findMinimumCostPath(a));
	}
}
