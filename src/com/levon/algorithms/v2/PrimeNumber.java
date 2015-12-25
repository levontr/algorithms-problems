package com.levon.algorithms.v2;

import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		// System.out.println(isPrimer(25));
		int[] a = findNumberFactors(36);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				System.out.println(a[i]);
			}
		}
	}

	public static boolean isPrimer(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean[] findPrimesToN(int n) {
		boolean[] primes = new boolean[n + 1];
		for (int i = 1; i <= n; i++) {
			primes[i] = true;
		}
		primes[0] = false;
		primes[1] = false;
		for (int i = 2; i < primes.length; i++) {
			if (primes[i] == false) {
				for (int j = 2; j * i < Math.sqrt(primes.length); j++) {
					primes[i * j] = false;
				}
			}
		}
		return primes;
	}

	public static int[] findNumberFactors(int a) {
		Double d = Math.sqrt(a);
		int sqrtA = d.intValue();
		int[] factors = new int[a];
		int j = 0;
		for (int i = 1; i <= sqrtA; i++) {
			if (a % i == 0) {
				factors[j] = i;
				if(i != sqrtA) {
					factors[j + 1] = a / i;	
				}
				
				j += 2;
			}
		}
		return factors;
	}
}
