package com.levon.algorithms.dynamicprogramming;

import java.util.Scanner;

public class LongestPalindromicSubsequence {

	/**
	 * 
	 * @param str
	 * @return
	 * 
	 * solved using dynamic programming, time complexity O(n^2)
	 * 
	 */
	
	public static String findLongestPalindromicSubSecuance(String str) {
		int n = str.length();
		boolean[][] palindrom = new boolean[n][n];
		int maxLen = 0;
		int palindromBeginsAt = 0;
		for (int i = 0; i < n; i++) {
			palindrom[i][i] = true;
		}
		for (int i = 0; i < n-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				palindrom[i][i+1] = true;
				palindromBeginsAt = i;
				maxLen = 2;
			}
		}
		for (int curLength = 3; curLength <= n; curLength++) {
			for (int i = 0; i < n-curLength+1; i++) {
				int j = i+curLength-1;
				if(str.charAt(i) == str.charAt(j) && palindrom[i+1][j-1]) {
					palindrom[i][j] = true;
					palindromBeginsAt = i;
					maxLen = curLength;
				}
			}
		}
		return str.substring(palindromBeginsAt, maxLen+1);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		scanner.close();
		System.out.println("initial string = "+input);
		System.out.println("longest polindrom "+ findLongestPalindromicSubSecuance(input));
	}
}
