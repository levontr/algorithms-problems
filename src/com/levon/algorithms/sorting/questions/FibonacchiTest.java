package com.levon.algorithms.sorting.questions;

public class FibonacchiTest {
	public static void main(String[] args) {
	//	System.out.println(findFibonacchiNumber(45));
		long[] f = new long[2000];
		for (int i = 0; i < f.length; i++) {
			f[i] = -1;
		}
		int n = 150;
		System.out.println("Fibonacci of "+n);
		System.out.println(fibonacciRecursiveMem(n, f));
		System.out.println(findFibonacchiNumber(n));
		
	}
	public static long findFibonacchiNumber(int n) {
		long fibS = 0;
		long fibE = 1;
		long fibN = 0;
		for (int i = 2; i <= n; i++) {
			fibN = fibS + fibE;
			fibS = fibE;
			fibE = fibN;
		}
		return fibN;
	}
	
	public static long fibonacciRecursiveMem(int n, long[] f) {
		if(n == 1) {
			return 1;
		}
		if(n == 0) {
			return 0;
		}
		if(f[n] != -1) {
			return f[n];
		}
		f[n] = fibonacciRecursiveMem(n-1, f)+fibonacciRecursiveMem(n-2, f);
		return f[n];
	}
}

