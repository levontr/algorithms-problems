package com.levon.algorithms;

public class FindSubstringWithRegExTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s2 = "4555178sdadasdsa";
		String s1 = "\\*51\\*78\\";
		char[] largeArray = s1.toCharArray();
		char[] subArray = s2.toCharArray();
		// System.out.println(isSubstring(largeArray, subArray));
		System.out.println(findMe(s1, s2));
	}

	public static boolean isSubstring(char[] largeArray, char[] subArray) {

		if (largeArray.length == 0 || subArray.length == 0) {
			return false;
		}
		startOver: for (int i = 0; i < largeArray.length; i++) {
			// if (largeArray[i] == subArray[0]) {
			int k = i; // i + 1;
			boolean checkForNextMatchAfterRegEx = false;
			int v = 0;
			saerchForNextMatch: for (int j = 0; j < subArray.length; j++) {
				if (checkForNextMatchAfterRegEx) {
					if (!(subArray[j] == largeArray[k])) {
						continue saerchForNextMatch;
					}
					checkForNextMatchAfterRegEx = false;
				}

				if (k < largeArray.length) {
					v = k + 1;
					if (largeArray[k] != subArray[j] && v < largeArray.length) {
						if (largeArray[k] == '\\' && largeArray[v] == '*') {
							if (v + 1 >= largeArray.length) {
								return true;
							} else {
								k = k + 2;
								checkForNextMatchAfterRegEx = true;
								continue saerchForNextMatch;
							}
						}
						continue startOver;
					} else {
						k++;
					}
				} else {
					return false;
				}

			}
			return true;
			// }
		}
		return false;

	}

	public static boolean findMe(String subString, String mainString) {
		boolean foundme = false;
		int max = mainString.length() - subString.length();

		// Java's Default "contains()" Method
		System.out
				.println(mainString.contains(subString) ? "mainString.contains(subString) Check Passed.."
						: "mainString.contains(subString) Check Failed..");

		// Implement your own Contains Method with Recursion
		checkrecusion: for (int i = 0; i <= max; i++) {
			int n = subString.length();

			int j = i;
			int k = 0;

			REGEXHIT: while (n-- != 0) {
				if (mainString.charAt(j) != subString.charAt(k)) {
					if (subString.charAt(k) == '\\') {
						if (k + 2 >= subString.length()	&& subString.charAt(k + 1) == '*') {
							if (k + 2 >= subString.length()) {
								foundme = true;
								break;
							} else {
								char nextToRegEx = subString.charAt(k + 2);
								while (j < mainString.length()) {
									if (mainString.charAt(j) == nextToRegEx) {
										j++;
										k = k + 3;
										n = n - 2;
										if (k >= subString.length()) {
											foundme = true;
											break;
										}
										continue REGEXHIT;
									}
									j++;
								}
							}

						}
					}
					continue checkrecusion;
				}
				j++;
				k++;
			}
			foundme = true;
			break checkrecusion;
		}
		System.out
				.println(foundme ? "\nImplement your own Contains() Method - Result: Yes, Match Found.."
						: "\nImplement your own Contains() Method - Result:  Nope - No Match Found..");
		return foundme;
	}

}
