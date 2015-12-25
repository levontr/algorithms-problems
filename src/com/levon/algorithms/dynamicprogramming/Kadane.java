package com.levon.algorithms.dynamicprogramming;

// find max subsequence in array
public class Kadane {
	
	int max;
	int start;
	int end;

	public KadaneResult kadane(int[] arr) {
		int maxSoFar = 0;
		int maxThisPoint = 0;
		for (int i = 0; i < arr.length; i++) {
			maxThisPoint = maxThisPoint+arr[i];
			
			if(maxThisPoint < 0) {
				maxThisPoint = 0;
				start = i+1; 
			}
			if(maxSoFar < maxThisPoint) {
				maxSoFar = maxThisPoint;
				end = i;
			}
		}
		return new KadaneResult(maxSoFar, start, end);
	} 

}
