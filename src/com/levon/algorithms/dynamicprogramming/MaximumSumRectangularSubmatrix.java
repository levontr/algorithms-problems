package com.levon.algorithms.dynamicprogramming;

public class MaximumSumRectangularSubmatrix {
	
	public static Result findMaximumSumRectangularSubmatrix(int[][] input) {
	
		Result result = new Result();
		int row = input.length;
		int col = input[0].length;
		for (int left = 0; left < col; left++) {
			int[] temp = new int[row];
			for (int i = 0; i < temp.length; i++) {
				temp[i] = 0;
			}
			for (int right = left; right < col; right++) {
				for (int j = 0; j < row; j++) {
					temp[j] +=input[j][right];
				}
				KadaneResult kadaneResult = new Kadane().kadane(temp);
				if(kadaneResult.sum > result.maxSum) {
					result.maxSum = kadaneResult.sum;
					result.leftBound = left;
					result.rightBound = right;
					result.upBound = kadaneResult.start;
					result.lowBound = kadaneResult.end;
				}
			}
		}
		return result;
				
	}
	
	public static void main(String[] args) {
		int input[][] = {{ 2,  1, -3, -4,  5},
						 { 0,  6,  3,  4,  1},
						 { 2, -2, -1,  4, -5},
						 {-3,  3,  1,  0,  3}};
		Result result = findMaximumSumRectangularSubmatrix(input);
		System.out.println(result.toString());
	}

}
class Result {
	int maxSum;
    int leftBound;
    int rightBound;
    int upBound;
    int lowBound;
    @Override
    public String toString() {
        return "Result [maxSum=" + maxSum + ", leftBound=" + leftBound
                + ", rightBound=" + rightBound + ", upBound=" + upBound
                + ", lowBound=" + lowBound + "]";
    }
}
