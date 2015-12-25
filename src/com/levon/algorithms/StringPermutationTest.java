package com.levon.algorithms;

public class StringPermutationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printPermutations("", "ABCD");

	}
	public static void printPermutations(String prefix, String str) {
		int n = str.length();
		if(n == 0) {
			System.out.println(prefix);
		}
		else {
			for(int i=0; i<n; i++) {
				printPermutations(prefix+str.charAt(i), str.substring(0, i)+str.substring(i+1));
			}
		}
	}

}
