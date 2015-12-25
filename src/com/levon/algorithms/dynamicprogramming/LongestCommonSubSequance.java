package com.levon.algorithms.dynamicprogramming;

public class LongestCommonSubSequance {

	
	public static String findLongestCommonSubSequance(String a, String b) {
		StringBuilder sub = new StringBuilder();
		int[][] T = new int[a.length()+1][b.length()+1];
		for (int i = 0; i < T.length; i++) {
			T[i][0] = 0;
		}
		for (int i = 0; i < T[0].length; i++) {
			T[0][i] = 0;
		}
		for (int i = 1; i < T.length; i++) {
			for (int j = 1; j < T[i].length; j++) {
				if(a.charAt(i-1) == b.charAt(j-1)) {
					System.out.println(a.charAt(i-1)+"=="+b.charAt(j-1));
					T[i][j] = T[i-1][j-1]+1;
					sub.append(a.charAt(i-1));
				} else {
					System.out.println(a.charAt(i-1)+"!="+b.charAt(j-1));
					T[i][j] = Math.max(T[i][j-1], T[i-1][j]);
				}
			}
		}
		return sub.toString();
	}
	
	public static void main(String[] args) {
		String b = "abcdef";
		String a = "bdf";
		System.out.println(findLongestCommonSubSequance(a, b));
	}
}
