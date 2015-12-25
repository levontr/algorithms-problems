package com.levon.algorithms;

public class Tower {
	
	public static void main(String[] args) {
	
		System.out.println(findElement(2, 1));
	
	}
	
	public static int findElement(int row, int column) {
		if(row < column) {return 0;}
		if(row == 0 || column == 0) {return 1;}
		int[][] x = new int[row+1][row+1];
		x[0][0] = 1;
		nextRow: for(int i=1; i<row+1; i++) {
		for(int j=0; j<row+1; j++) {
				if(j==0 || j == row) {
					x[i][j] = 1;
					continue;
				}
				if(i==j) {
					x[i][j] = 1;
					continue nextRow;
				}
				x[i][j] = x[i-1][j-1]+x[i-1][j];
			}
		}
		
		return x[row][column];
	}

}
