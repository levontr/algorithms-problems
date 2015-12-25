package com.levon.amazon.algorithms.sorting;

public class HexAndBiToDigit {
	public static void main(String[] args) {
		int i = digitToValue('C');
		int a = new Character('1');
		int b = new Character('0');
		System.out.println(a);
		System.out.println(b);
		System.out.println(i);
	}
	public static int digitToValue(char c) {
		if (c >= '0' && c <= '9') return c - '0';
		 else if (c >= 'A' && c <= 'F') return 10 + c - 'A';
		 else if (c >= 'a' && c <= 'f') return 10 + c - 'a';
		return -1;
	}
		
}
