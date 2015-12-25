package com.levon.algorithms;

public class FindNumberOfCertainDigitsSequanceTEST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 777;
		int numberOfDigits = 4;
		int sequanceOfDigits = (int)(Math.log10(number)+1); //= String.valueOf(number).length();
		System.out.println("numberOfDigits = "+numberOfDigits);
		System.out.println("sequanceOfDigits = "+sequanceOfDigits);
		System.out.println("number = "+ findNumberOfSequance(numberOfDigits, sequanceOfDigits));

	}

	public static double findNumberOfSequance(int numberOfDigits, int sequanceOfDigits) {
		return (numberOfDigits - sequanceOfDigits+1)*Math.pow(10, numberOfDigits-sequanceOfDigits);
	}

}
