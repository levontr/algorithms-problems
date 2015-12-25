package com.levon.algorithms;

public class PalindromeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("the number 12233221 is palindrome: "
				+ isPalindrome(12233221));

	}

	public static boolean isPalindrome(int number) {
		int number2 = number;
		int reverse = 0;
		while (number != 0) {
			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}
		if (number2 == reverse) {
			return true;
		} else {
			return false;
		}

	}

}
