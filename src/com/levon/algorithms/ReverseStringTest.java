package com.levon.algorithms;

public class ReverseStringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "abcdcba";
		if(str.equals(reverseByIterator(str))) {
			System.out.println("string is palindrome - "+str);
			int[] ar = new int[4];
		}
		else {
			System.out.println("string is not palindrome - "+str);
		}


	}

	public static String reverseRecursively(String str) {
		if(str.length()==1) {
			return str;
		}
		return reverseRecursively(str.substring(1))+str.charAt(0);
	}
	public static String reverseByIterator(String str) {
		StringBuilder reverse = new StringBuilder();
		char[] chars = str.toCharArray();
		for(int i=chars.length-1; i>=0; i--) {
			reverse.append(chars[i]);
		}
		return reverse.toString();
	}

}
