package com.levon.test;
import javax.print.attribute.standard.NumberOfDocuments;

public class ReveseStringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(reverse("ABCD"));
		System.out.println(findMax(new int[]{5,8,44,3,95,741,5,853,7777,841}));
		int number = 77777;
		int digits = 4;
		System.out.println("numberOfDigits = "+digits);
		System.out.println("number being tested - "+number);
		System.out.println("number = "+ findSequance(digits, number));
	}

	public static String reverse(String str) {
		if(str.length() == 1) {
			return str;
		}
		return reverse(str.substring(1))+str.charAt(0);
	}

	public static int findMax(int[] array) {
		if(array == null) {
			throw new RuntimeException();
		}
		int max = array[0];
		for (int i=1; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	public static int findSequance(int digits, int number) {
		int digitsOfNumber = (int)Math.log10(number)+1;
		return (int)((digits - digitsOfNumber+1)*Math.pow(10, digits-digitsOfNumber));
	}

}
