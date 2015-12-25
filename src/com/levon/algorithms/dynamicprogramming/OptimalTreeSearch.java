package com.levon.algorithms.dynamicprogramming;

public class OptimalTreeSearch {
	
	public static int findOptimalTree(int[] input, int[] freq) {
		int[][] T = new int[input.length][input.length];
		for (int i = 0; i < T.length; i++) {
			T[i][i] = freq[i];
		}
		for (int l = 2; l <= input.length; l++) {
			for (int i = 0; i < input.length-l+1; i++) {
				int j = i+l-1;
				int sum = sum(freq, i, j);
				T[i][j] = Integer.MAX_VALUE;
				for (int k = i; k <= j; k++) {
					int temp = sum + (k-1<i?0:T[i][k-1]) 
							+ (k+1>j?0:T[k+1][j]);
					if(temp < T[i][j]) {
						T[i][j] = temp;
					}
				}
			}
		}
		return T[0][T.length-1];
	}

	private static int sum(int[] freq, int i, int j) {
		int sum = 0;
		for (int k = i; k <= j; k++) {
			sum +=freq[k];
		}
		return sum;
	}

	public static void main(String[] args) {
		int input[] = {10,12,20,35,46};
        int freq[] = {34,8,50,21,16};
        System.out.println(findOptimalTree(input, freq));
        System.out.println(findOptimalTree(input, freq));
	}
}
