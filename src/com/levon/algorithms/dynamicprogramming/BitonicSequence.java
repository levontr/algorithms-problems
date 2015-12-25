package com.levon.algorithms.dynamicprogramming;

public class BitonicSequence {
	
	public static int findBitonicSequence(int[] a) {
		int n = a.length;
		int TI[] = new int[n];
		int TD[] = new int[n];
		int TB[] = new int[n];
		
		for (int i = 0; i < TI.length; i++) {
			TI[i] = 1;
			TD[i] = 1;
		}
		
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if(a[i] > a [j]) {
					TI[i] = Math.max(TI[i], TI[j]+1);
				}
			}
		}
		for (int i = n-2; i >= 0; i--) {
			for (int j = n-1; j > i; j--) {
				if(a[i] > a [j]) {
					TD[i] = Math.max(TD[i], TD[j]+1);
				}
			}
		}
		for (int i = 0; i < TD.length; i++) {
			TB[i] = TI[i]+TD[i]-1;
		}
		int max = TB[0];
		for (int i = 1	; i < TB.length; i++) {
			if(TB[i] > max) {
				max = TB[i];
			}
		}
		return max;
	}
	
	public static void main(String args[]){
        BitonicSequence bs = new BitonicSequence();
        int[] arr = {1,4,3,7,2,1,8,11,13,0};
        int r = bs.findBitonicSequence(arr);
        System.out.print(r);
    
    }

}
