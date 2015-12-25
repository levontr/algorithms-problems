package com.levon.algorithms.dynamicprogramming;

public class MinimumEditDistance {

	public static int findMinimumEditDistance(String a, String b) {
		StringBuilder sub = new StringBuilder();
		int[][] T = new int[a.length()+1][b.length()+1];
		for (int i = 0; i < T.length; i++) {
			T[i][0] = i;
		}
		for (int i = 0; i < T[0].length; i++) {
			T[0][i] = i;
		}
		for (int i = 1; i < T.length; i++) {
			for (int j = 1; j < T[i].length; j++) {
				if(a.charAt(i-1) == b.charAt(j-1)) {
					System.out.println(a.charAt(i-1)+"=="+b.charAt(j-1));
					T[i][j] = T[i-1][j-1];
					sub.append(a.charAt(i-1));
				} else {
					System.out.println(a.charAt(i-1)+"!="+b.charAt(j-1));
//					int min = T[i-i][j-1];
//					if(T[i][j-1] < min & T[i][j-1] > T[i-1][j]) {
//						min = T[i-1][j];
//						System.err.println();
//					}
//					else if(T[i][j-1] < min & T[i][j-1] < T[i-1][j]) {
//						min = T[i-1][j];
//						System.err.println();
//					}
//					else if (T[i][j-1] < min & T[i][j-1] > T[i-1][j]) {
//						
//					}
					T[i][j] = Math.min(T[i-1][j-1], Math.min(T[i][j-1], T[i-1][j]))+1;
				}
			}
		}
		return T[a.length()][b.length()];
	}
	public static void main(String[] args) {
		String b = "abcdef";
		String a = "kbndsf";
		System.out.println(findMinimumEditDistance(a, b));
	}
}
