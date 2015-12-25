package com.levon.algorithms.dynamicprogramming;

public class CoinChangingMinimumNumber {

	public static int coinChanging(int[] coins, int total) {
		int[][] number = new int [coins.length+1][total+1];
		for (int i = 0; i < number.length; i++) {
			number[i][0] = 1;
		}
		for (int i = 1; i <= coins.length; i++) {
			for (int j = 1; j <= total; j++) {
				if(coins[i-1] <= j) {
					number[i][j] = number[i-1][j] + number[i][j-coins[i-1]];
				}
				else {
					number[i][j] = number[i-1][j];
				}
			}
		}
		return number[coins.length][total];
		
	}
	
}
