package com.levon.algorithms.dynamicprogramming;

import java.util.HashMap;

public class MaximumSubsquareWithSidesAsX {

	public static int findMaximumSubsquareWithSidesAsX(char[][] input) {

		Cell[][] T = new Cell[input.length][input[0].length];
		for (int i = 0; i < T.length; i++) {
			for (int j = 0; j < T.length; j++) {
				T[i][j] = new Cell();
			}
		}

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[0].length; j++) {
				if (input[i][j] == 'X') {
					if (i == 0 && j == 0) {
						T[i][j].vert = 1;
						T[i][j].horiz = 1;

					} else if (i == 0) {
						T[i][j].horiz = T[i][j - 1].horiz + 1;
						T[i][j].vert = 1;
					} else if (j == 0) {
						T[i][j].horiz = 1;
						T[i][j].vert = T[i - 1][j].vert + 1;
					} else {
						T[i][j].horiz = T[i][j - 1].horiz + 1;
						T[i][j].vert = T[i - 1][j].vert + 1;
					}
				}
			}
		}
		int max = 1;
        for(int i=T.length -1; i >=0 ; i--){
            for(int j= T[0].length-1 ; j >=0; j--){
                if(T[i][j].vert == 1 || T[i][j].horiz ==1 ){
                    continue;
                }
                int min = Math.min(T[i][j].vert, T[i][j].horiz);
                int k = 0;
                for(k=min; k > 1; k--){
                    if(T[i][j-k+1].vert >= k && T[i-k+1][j].horiz >= k){
                        break;
                    }
                }
                if(max < k){
                    max = k;
                }
            }
        }
		return max;
	}

	public static void main(String[] args) {
		char[][] input = { { 'X', 'O', 'O', 'O', 'O', 'O' },
						   { 'O', 'O', 'O', 'O', 'O', 'O' },
						   { 'X', 'X', 'X', 'X', 'O', 'O' },
						   { 'X', 'X', 'X', 'X', 'X', 'O' },
						   { 'X', 'O', 'O', 'X', 'X', 'O' },
						   { 'X', 'X', 'X', 'X', 'X', 'O' } };

		char[][] input1 = { { 'O', 'O', 'O', 'O', 'O', 'X' },
							{ 'O', 'X', 'O', 'X', 'X', 'X' },
							{ 'O', 'X', 'O', 'X', 'O', 'X' },
							{ 'O', 'X', 'X', 'X', 'X', 'X' },
							{ 'O', 'O', 'O', 'O', 'O', 'O' }, };

		char[][] input2 = { { 'O', 'O', 'X', 'O', 'X' },
							{ 'O', 'X', 'X', 'O', 'X' }, 
							{ 'O', 'X', 'O', 'X', 'X' },
							{ 'X', 'X', 'X', 'X', 'X' }, 
							{ 'O', 'X', 'X', 'X', 'O' }, };
	
		System.out.println(findMaximumSubsquareWithSidesAsX(input));
	}
}

class Cell {
	int vert;
	int horiz;
}