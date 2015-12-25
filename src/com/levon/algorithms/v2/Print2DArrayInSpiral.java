package com.levon.algorithms.v2;

public class Print2DArrayInSpiral {

	public static void print2DArrayInSpiral(int[][] a, int n, int m) {
		int T = 0;
		int B = m - 1;
		int R = n - 1;
		int L = 0;
		int dir = 0;

		while (T <= B && L <= n) {
			if (dir == 0) {
				for (int i = L; i <= R; i++) {
					System.out.println(a[T][i]);
				}
				T++;
				dir++;
			}
			else if (dir == 1) {
				for (int i = T; i <= B; i++) {
					System.out.println(a[i][R]);
				}
				R--;
				dir++;
			}
			else if (dir == 2) {
				for (int i = R; i >= L; i--) {
					System.out.println(a[B][i]);
				}
				B--;
				dir++;
			}
			else if (dir == 3) {
				for (int i = B; i >= T; i--) {
					System.out.println(a[i][L]);
				}
				L++;
				dir = 0;
			}
		}
	}

	public static void main(String[] args) {
		int[][] a = {{1, 2, 3,  4},
					 {5, 6, 7,  8},
					 {9, 10,11, 12},
					 {13,14,15, 16}};
		print2DArrayInSpiral(a, a.length, 4);
	}
}
