package com.levon.algorithms.dynamicprogramming;

import java.util.Scanner;

public class LongestPalindromeSubsequence2 {
	
	public static int findLongestPalindromeSubsequence(String s) {
		int n = s.length();
		int[][] T = new int[n][n];
		for (int i = 0; i < T.length; i++) {
			T[i][i] = 1;
		}
		for (int length = 2; length <= n; length++) {
			int i = 0;
			int j = length-1;
			while(j < T.length) {
				if(s.charAt(i) == s.charAt(j)) {
					T[i][j] = T[i+1][j-1] + 2;
					System.out.println(s.charAt(i) +"=="+ s.charAt(j));
				} else {
					System.out.println(s.charAt(i) +"!="+ s.charAt(j));
					T[i][j] = Math.max(T[i+1][j], T[i][j-1]);
				}
				i++;
				j++;	
			}
		}
		return T[0][n-1];
		
//		for (int i = 0; i < T.length; i++) {
//			for (int j = 0; j < T.length; j++) {
//				if(s.char)
//			}
//		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		scanner.close();
		System.out.println("initial string = "+input);
		System.out.println("longest polindrom "+ findLongestPalindromeSubsequence(input));
	}
}
