package com.levon.algorithms.dynamicprogramming;

public class TotalWaysInMatrix {
	public static int findTotalWaysInMatrix(int n, int m) {
		StringBuilder sub = new StringBuilder();
		int[][] T = new int[n][m];
		for (int i = 0; i < T.length; i++) {
			T[i][0] = 1;
		}
		for (int i = 0; i < T[0].length; i++) {
			T[0][i] = 1;
		}
		
		for (int i = 1; i < T.length; i++) {
			for (int j = 1; j < T[i].length; j++) {
				T[i][j] = T[i-1][j]+T[i][j-1];
			}
		}
		return T[n-1][m-1];
	}
	
	public static void main(String[] args) {
		String b = "abcdef";
		String a = "bdf";
		System.out.println(findTotalWaysInMatrix(4, 4));
	}

}
