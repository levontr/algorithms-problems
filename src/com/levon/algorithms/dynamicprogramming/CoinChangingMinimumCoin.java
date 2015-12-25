package com.levon.algorithms.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class CoinChangingMinimumCoin {

	/**
	 * Given a total and coins of certain denomination with infinite supply,
	 * what is the minimum number of coins it takes to form this total.
	 * 
	 * @return
	 */

	public static int coinChangingMinimumCoin(int[] a, int total,
			Map<Integer, Integer> mem) {

		if (total == 0) {
			return 0;
		}
		if (mem.containsKey(total)) {
			return mem.get(total);
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			int val;
			if(total - a[i] < 0) {
				continue;
			}
			val = coinChangingMinimumCoin(a, total - a[i], mem);
			if (val < min) {
				min = val;
			}
		}
		min = (min == Integer.MAX_VALUE ? min : min + 1);
		mem.put(total, min);
		return min;
	}

	public static int coinChangingBottomUp(int[] a, int total) {
		int[] temp = new int[total + 1];
		temp[0] = 0;
		for (int i = 1; i < temp.length; i++) {
			temp[i] = Integer.MAX_VALUE - 1;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j <= total; j++) {
				if(j >= a[i]) {
					temp[j] = Math.min(temp[j], temp[j-a[i]]+1);	
				}
			}
		}
		return temp[total];
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {1,2,3};
		int total = 5;
		System.out.println(coinChangingBottomUp(a, total));
		Map<Integer, Integer> mem = new HashMap<>();
		System.out.println(coinChangingMinimumCoin(a, total, mem));
	}
}
