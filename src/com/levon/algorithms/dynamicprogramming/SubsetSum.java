package com.levon.algorithms.dynamicprogramming;

public class SubsetSum {

	public static boolean ifSubsetIsSumOfN(int[] subset, int n) {
		
		boolean[][] T = new boolean[subset.length+1][n+1];
		for (int i = 0; i < T.length; i++) {
			T[i][0] = true;
		}
		for (int i = 1; i <= subset.length; i++) {
			for (int j = 1; j <= n; j++) {
				if(subset[i-1] > j) {
					T[i][j] = T[i-1][j];
				} else {
					T[i][j] = T[i-1][j] || T[i-1][j-subset[i-1]];
				}
			}
		}
		return T[subset.length][n];
	}
	
	public static boolean subsetSum(int input[], int total) {

        boolean T[][] = new boolean[input.length + 1][total + 1];
        for (int i = 0; i <= input.length; i++) {
            T[i][0] = true;
        }

        for (int i = 1; i <= input.length; i++) {
            for (int j = 1; j <= total; j++) {
                if (j - input[i - 1] >= 0) {
                    T[i][j] = T[i - 1][j] || T[i - 1][j - input[i - 1]];
                } else {
                    T[i][j] = T[i-1][j];
                }
            }
        }
        return T[input.length][total];

    }
	public static void main(String[] args) {
		int[] subset = {2,3,5,8};
		System.out.println(ifSubsetIsSumOfN(subset, 11));
		System.out.println(subsetSum(subset, 11));
	}
}
